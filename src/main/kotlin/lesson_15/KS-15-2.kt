package org.example.lesson_15

import org.example.lesson_12.weather

abstract class WeatherStationStats()

open class Temperature(): WeatherStationStats()

open class PrecipitationAmount():  WeatherStationStats()

class WeatherServer(){
    fun sendingMessage(messageType: WeatherStationStats){
     when (messageType) {
         is Temperature ->{ println("тип переданного сообщения температурный")}
         is PrecipitationAmount ->{ println("тип переданного сообщения количество осадков")}
         else ->{ println("тип переданного сообщения неизвестен")}

        }
    }
}

fun main(){
    val server1 = WeatherServer()
    val temperature1 = Temperature()
    val precipitationAmount1 = PrecipitationAmount()

    server1.sendingMessage(temperature1)
    println()
    server1.sendingMessage(precipitationAmount1)


}
