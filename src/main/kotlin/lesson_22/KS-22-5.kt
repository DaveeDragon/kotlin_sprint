package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val placeNameOrEvent: String,
    val descriptionPlaceOrEvent: String,
    val dateAndTimeOfEvent: LocalDateTime,
    val distanceInLightYears: Double,
){}

fun main(){
    val galactic1 = GalacticGuide("Альфа-Центавра",
        "тройная звёздная система в созвездии Центавра",
        LocalDateTime.now(), 4.3)


    println("имя звезды/события - ${galactic1.component1()}" +
            "\nописание звезды/события - ${galactic1.component2()}" +
            "\nвремя наблюдения звезды/события - ${galactic1.component3()}" +
            "\nрастояние в световых годах от обьекта/события - ${galactic1.component4()}")

}