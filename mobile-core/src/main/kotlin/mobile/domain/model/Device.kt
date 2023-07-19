package mobile.domain.model

import domail.IDevice
import org.springframework.data.relational.core.mapping.Table

@Table(name = "tb_device")
data class Device(
    override val name: String,
    override val brand: String,
    override val technology: String,
    override val band2g: String,
    override val band3g: String,
    override val band4g: String
): IDevice
