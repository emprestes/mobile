package mobile.app.client

import domail.IDevice
import reactor.core.publisher.Mono

interface IWebClient {

    suspend fun findOne(brand: String, device: String): Mono<out IDevice>
}
