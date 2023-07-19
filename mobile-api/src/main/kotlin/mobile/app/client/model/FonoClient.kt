package mobile.app.client.model

import mobile.app.client.IWebClient
import mobile.domain.model.Device
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Component
class FonoClient(
    @Qualifier("webClient")
    private val client: WebClient
): IWebClient {

    override suspend fun findOne(brand: String, device: String) = client.get()
        .uri("/v1/getdevice/{brand}/{device}", brand, device)
        .retrieve()
        .bodyToFlux(Device::class.java)
}
