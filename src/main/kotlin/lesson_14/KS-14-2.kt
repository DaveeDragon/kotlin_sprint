package org.example.lesson_14

open class linerShips2(
    val name: String = "liner",
    val speed: Int = 30,
    val capacity: Int = 50,
    val lifting: Int = 30,
    val isBreakingIce: Boolean = false,
){
    fun loadingMethod(){
        println("лайнер выдвигает горизонтальный трап со шкафута")
    }
    fun shipProperties(){
        println("имя корабля - $name")
        println("скорость корабля - $speed")
        println("вместимость корабля - $capacity")
        println("грузоподьемность корабля - $lifting")
        println("ледокол ли корабль? - $isBreakingIce")
    }
}

class cargoShips2(
    name: String = "cargo",
    speed: Int = 20,
    capacity: Int = 30,
    lifting: Int = 50,
    isBreakingIce: Boolean = false,
) : linerShips2(name, speed, capacity, lifting, isBreakingIce){
    fun cargoLoadingMethod(){
        println("грузовой корабль активирует погрузочный кран")
    }
}


class iceBreakers2(
    name: String = "iceBreaker",
    speed: Int = 10,
    capacity: Int = 10,
    lifting: Int = 10,
    isBreakingIce: Boolean = true,
)  : linerShips2(name, speed, capacity, lifting, isBreakingIce){
    fun breakerLoadingMethod(){
        println("ледокол открывает ворота со стороны кормы")
    }
}

fun main(){
    val iceBreaker5 = iceBreakers2()
    iceBreaker5.shipProperties()
}