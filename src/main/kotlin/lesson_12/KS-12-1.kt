package org.example.lesson_12

fun main(){
    val friday = weather()
    friday.dayTemperature = 23
    friday.nightTemperature = 15
    friday.isRianing = false

    val saturday = weather()
    saturday.dayTemperature = 17
    saturday.nightTemperature = 8
    saturday.isRianing = true

    friday.toConsole()
    println()
    saturday.toConsole()
}
