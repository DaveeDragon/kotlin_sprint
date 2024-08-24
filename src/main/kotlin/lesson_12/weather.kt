package org.example.lesson_12

class weather() {
    var dayTemperature: Int = 20
    var nightTemperature: Int = 10
    var isRianing: Boolean = false

    fun toConsole(){
        println("Дневная температура равна: $dayTemperature")
        println("Ночная температура равна: $nightTemperature")
        println("Идет ли дождь: $isRianing")
    }

}