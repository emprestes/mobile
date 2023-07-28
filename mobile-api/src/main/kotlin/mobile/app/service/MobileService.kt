package mobile.app.service

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import mobile.app.client.IWebClient
import mobile.app.mapper.mapToMobile
import mobile.app.repository.IMobileRepository
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.*
import reactor.kotlin.core.publisher.toMono

@RestController
@RequestMapping("/v1/device")
class MobileService(
    @Qualifier("fonoClient")
    private val fonoClient: IWebClient,
    @Qualifier("localClient")
    private val localClient: IWebClient,
    private val repository: IMobileRepository
) {

    @GetMapping("/devices")
    suspend fun loadAll() = repository.findAll()

    @PostMapping("/book/{brand}/{device}/{bookedBy}")
    suspend fun bookNow(@PathVariable brand: String, @PathVariable device: String, @PathVariable bookedBy: String) = try {
        try {
            book(brand, device, bookedBy, localClient)
        } catch (cause: Throwable) {
            book(brand, device, bookedBy, fonoClient)
        }
    } catch (cause: Throwable) {
        throw cause
    }

    private suspend fun book(brand: String, device: String, bookedBy: String, client: IWebClient) =
        withContext(Dispatchers.IO) {
            repository.findOneBy(brand, device)
                .filter { it.isBooked }
                .or(client
                    .findOne(brand, device)
                    .map { mapToMobile(it) }
                    .map { it.bookedBy(bookedBy) }
                    .flatMap(repository::save)
                    .log()
                    .block()
                    .toMono()
                )
        }

    @PostMapping("/return/{brand}/{device}")
    suspend fun returnNow(@PathVariable brand: String, @PathVariable device: String) = with(repository) {
        findOneBy(brand, device)
            .map { it.released() }
            .flatMap { save(it) }
    }
}
