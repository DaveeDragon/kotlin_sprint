package org.example.lesson_12

class weather2(_dayTemperature: Int, _nightTemperature: Int, _isRianing: Boolean) {

    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var isRianing = _isRianing

    fun toConsole(){
        println("Дневная температура равна: $dayTemperature")
        println("Ночная температура равна: $nightTemperature")
        println("Идет ли дождь: $isRianing")
    }

}