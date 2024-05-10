package org.example.lesson_2

fun main(){
    val departureTime = 9*60 + 45
    val travelTime = 457
    val arrivalTimeHours = (departureTime + travelTime)/60
    val arrivalTimeMinutes = (departureTime + travelTime)%60

    println("${arrivalTimeHours}:${arrivalTimeMinutes}")
}