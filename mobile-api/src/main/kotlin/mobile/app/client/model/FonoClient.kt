package mobile.app.client.model

import mobile.app.client.IWebClient
import mobile.app.mapper.mapToDevice
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import reactor.kotlin.core.publisher.toMono

@Component
class FonoClient(
    @Qualifier("webClient")
    private val client: WebClient
): IWebClient {

    override suspend fun findOne(brand: String, device: String) = client.get()
        .uri("/v1/getdevice/{brand}/{device}", brand, device)
        .retrieve()
        .bodyToFlux(HashMap::class.java)
        .map { mapToDevice(it) }
        .toMono()
}
