package org.example.lesson_4

fun main(){
    val sunnyWeather = true
    val openTent = true
    val humidityProcent = 0.2
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(sunnyWeather)and(openTent)and(humidityProcent == 0.2)and(season!="зима")}")
}