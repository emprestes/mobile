package mobile.app.mapper

import domail.IDevice
import mobile.domain.model.Mobile

fun mapToMobile(device: IDevice) = device.let {
    Mobile(
        name = "${it.name}",
        brand = "${it.brand}",
        technology = "${it.technology}",
        band2g = "${it.band2g}",
        band3g = "${it.band3g}",
        band4g = "${it.band4g}"
    )
}
