package org.example.lesson_14

open class linerShips2(
    val name: String = "liner",
    val speed: Int = 30,
    val capacity: Int = 50,
    val lifting: Int = 30,
    val isBreakingIce: Boolean = false,
){
   open fun loadingMethod(){
        println("$name лайнер выдвигает горизонтальный трап со шкафута")
    }

    fun shipProperties(){
        println("имя корабля - $name")
        println("скорость корабля - $speed")
        println("вместимость корабля - $capacity")
        println("грузоподьемность корабля - $lifting")
        println("этот корабль ледокол - $isBreakingIce")
        println()
    }
}


class cargoShips2(
    name: String = "cargo",
    speed: Int = 20,
    capacity: Int = 30,
    lifting: Int = 50,
) : linerShips2(name, speed, capacity, lifting)
{
    override fun loadingMethod(){
    println("$name грузовой корабль активирует погрузочный кран")
    }
}



class iceBreakers2(
    name: String = "iceBreaker",
    speed: Int = 10,
    capacity: Int = 10,
    lifting: Int = 10,
)  : linerShips2(name, speed, capacity, lifting, isBreakingIce = true)
{
   override fun loadingMethod(){
    println("$name ледокол открывает ворота со стороны кормы")
    }
}


fun main(){
    val liner1 = linerShips2()
    val cargo1 = cargoShips2()
    val iceBreaker1 = iceBreakers2()

    liner1.loadingMethod()
    cargo1.loadingMethod()
    iceBreaker1.loadingMethod()
    println()

    liner1.shipProperties()
    cargo1.shipProperties()
    iceBreaker1.shipProperties()

}