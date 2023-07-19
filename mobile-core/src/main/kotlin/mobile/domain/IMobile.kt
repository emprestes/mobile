package mobile.domain

import java.time.temporal.Temporal

interface IMobile {
    val name: CharSequence
    val brand: CharSequence
    val technology: CharSequence
    val band2g: CharSequence
    val band3g: CharSequence
    val band4g: CharSequence
    val bookedOn: Temporal?
    val bookedBy: CharSequence?
    val availability: Boolean

    fun bookedBy(name: String): IMobile

    fun released(): IMobile
}
