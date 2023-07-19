package fono.app.repository

import mobile.domain.model.Device
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import reactor.core.publisher.Flux

@ExtendWith(SpringExtension::class)
@SpringBootTest
class DeviceRepositoryTest {

    @Autowired
    lateinit var repository: IDeviceRepository

    @Test
    fun `Should find 9 devices`() {
        assertEquals(9, repository.findAll().size())
    }

    @Test
    fun `Should save a new device`() {
        Device(
            name = "New device",
            brand = "New brand",
            technology = "New Technology",
            band2g = "New 2g",
            band3g = "New 3g",
            band4g = "New 4g"
        ).apply {
            repository.save(this).subscribe {
                assertEquals(this, it)
            }
        }
    }
}

fun Flux<Device>.toList() = toStream().toList()
fun Flux<Device>.size() = toList().size
