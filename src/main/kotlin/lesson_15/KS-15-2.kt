package org.example.lesson_15

import org.example.lesson_12.weather

abstract class WeatherStationStats()

open class Temperature(): WeatherStationStats()

open class PrecipitationAmount():  WeatherStationStats()

class WeatherServer(){
    fun sendingMessage(messageType: String){
        println("сообщение типа $messageType отправлено на сервер")
    }
}

fun main(){
    val server1 = WeatherServer()
    val temperature1 = Temperature()
    val precipitationAmount1 = PrecipitationAmount()

    server1.sendingMessage("температура")
    println()
    server1.sendingMessage("количество осадков")


}
