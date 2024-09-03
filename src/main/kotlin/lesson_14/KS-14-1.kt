package org.example.lesson_14

open class linerShips(
    val name: String = "liner",
    val speed: Int = 30,
    val capacity: Int = 50,
    val lifting: Int = 30,
    val isBreakingIce: Boolean = false,
)

class cargoShips(
    name: String = "cargo",
    speed: Int = 20,
    capacity: Int = 30,
    lifting: Int = 50,
    isBreakingIce: Boolean = false,
) : linerShips(name, speed, capacity, lifting, isBreakingIce)
{}

class iceBreakers(
    name: String = "iceBreaker",
    speed: Int = 10,
    capacity: Int = 10,
    lifting: Int = 10,
    isBreakingIce: Boolean = true,
)  : linerShips(name, speed, capacity, lifting, isBreakingIce)
{}


fun main(){
    val liner1 = linerShips()
    val cargo1 = cargoShips()
    val iceBreaker1 = iceBreakers()
}