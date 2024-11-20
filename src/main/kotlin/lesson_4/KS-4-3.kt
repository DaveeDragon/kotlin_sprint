package org.example.lesson_4

fun main(){
    val suitableSunnyWeather = true
    val suitableOpenTent = true
    val suitableHumidityProcent = 0.2
    val suitableSeason = "не зима"

    val sunnyWeather = true
    val openTent = true
    val humidityProcent = 0.2
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(sunnyWeather == suitableSunnyWeather)and(openTent == suitableOpenTent)and(humidityProcent == suitableHumidityProcent)and(season == suitableSeason)}")
    }
