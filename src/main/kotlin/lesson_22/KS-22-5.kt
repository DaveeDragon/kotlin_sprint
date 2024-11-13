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

    val (place, description, date, distance) = galactic1

    println("имя звезды/события - $place" +
            "\nописание звезды/события - $description" +
            "\nвремя наблюдения звезды/события - $date" +
            "\nрастояние в световых годах от обьекта/события - $distance")

}