package mobile.app.service

import mobile.app.client.IWebClient
import mobile.app.mapper.mapToMobile
import mobile.app.repository.IMobileRepository
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/device")
class DeviceService(
    @Qualifier("fonoClient")
    private val fonoClient: IWebClient,
    @Qualifier("localClient")
    private val localClient: IWebClient,
    private val repository: IMobileRepository
) {

    @GetMapping("/book/{brand}/{device}/{bookedBy}")
    suspend fun bookNow(@PathVariable brand: String, @PathVariable device: String, @PathVariable bookedBy: String) = try {
        try {
            book(brand, device, bookedBy, fonoClient)
        } catch (cause: Throwable) {
            book(brand, device, bookedBy, localClient)
        }
    } catch (cause: Throwable) {
        throw cause
    }

    private suspend fun book(brand: String, device: String, bookedBy: String, client: IWebClient) = client
        .findOne(brand, device)
        .map { mapToMobile(it) }
        .map { it.bookedBy(bookedBy) }
        .flatMap(repository::save)

    @GetMapping("/return/{brand}/{device}")
    suspend fun returnNow(@PathVariable brand: String, @PathVariable device: String) = with(repository) {
        findOneBy(brand, device)
            ?.map { it.released() }
            ?.flatMap { save(it) }
    }
}
