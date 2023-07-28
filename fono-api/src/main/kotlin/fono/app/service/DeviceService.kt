package fono.app.service

import fono.app.repository.IDeviceRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class DeviceService(
    private val repository: IDeviceRepository
) {

    @GetMapping("/devices")
    suspend fun findAll() = repository.findAll()

    @GetMapping("/getdevice/{brand}/{device}")
    suspend fun getDevice(@PathVariable brand: String, @PathVariable device: String) = repository
        .findOneBy(brand, device)?.log()
}
