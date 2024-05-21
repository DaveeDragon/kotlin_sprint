package org.example.lesson_2

fun main(){
    val hourInMinutes = 60
    val hours = 9
    val minutes = 39
    val departureTime = hours * hourInMinutes + minutes
    val travelTime = 457
    val arrivalTimeHours = (departureTime + travelTime) / hourInMinutes
    val arrivalTimeMinutes = (departureTime + travelTime) % hourInMinutes


    println("${arrivalTimeHours}:${arrivalTimeMinutes}")
}