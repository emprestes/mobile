package fono.app.repository

import mobile.domain.model.Device
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface IDeviceRepository : ReactiveCrudRepository<Device, Long> {

    @Query("SELECT * FROM tb_device WHERE brand = :brand AND name = :device")
    fun findOneBy(brand: String, device: String): Mono<Device>?
}
