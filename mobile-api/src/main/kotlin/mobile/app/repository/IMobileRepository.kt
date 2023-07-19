package mobile.app.repository

import mobile.domain.model.Device
import mobile.domain.model.Mobile
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface IMobileRepository : ReactiveCrudRepository<Mobile, Long> {

    @Query("SELECT * FROM tb_mobile WHERE brand = :brand AND name = :device")
    fun findOneBy(brand: String, device: String): Mono<Mobile>?
}
