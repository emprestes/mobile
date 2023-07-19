package mobile.app.client

import domail.IDevice
import reactor.core.publisher.Flux

interface IWebClient {

    suspend fun findOne(brand: String, device: String): Flux<out IDevice>
}
