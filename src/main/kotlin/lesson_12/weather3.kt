package org.example.lesson_12

class weather3(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isRianing: Boolean,
) {
    fun toConsole(){
        println("Дневная температура равна: ${dayTemperature - 273}")
        println("Ночная температура равна: ${nightTemperature - 273}")
        println("Идет ли дождь: $isRianing")
    }

}