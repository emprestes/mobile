package mobile.domain.model

import mobile.domain.IMobile
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("tb_mobile")
data class Mobile(
    @Id
    private val id: Long? = null,
    override val name: String,
    override val brand: String,
    override val technology: String,
    override val band2g: String,
    override val band3g: String,
    override val band4g: String,
    @Column("booked_on")
    override val bookedOn: LocalDateTime? = null,
    @Column("booked_by")
    override var bookedBy: String? = null
) : IMobile {

    override val availability
        get() = bookedOn == null && bookedBy == null

    override fun bookedBy(name: String) = copy(
        bookedOn = LocalDateTime.now(),
        bookedBy = name
    )

    override fun released() = copy(
        bookedOn = null,
        bookedBy = null
    )
}
