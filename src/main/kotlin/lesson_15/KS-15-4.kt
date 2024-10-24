package org.example.lesson_15

abstract class MusicalGoods(
    val name: String,
    val quantity: Int,
){}

open class Instruments(name: String, quantity: Int): MusicalGoods(name, quantity), searchForAppropriateAccessories {}

open class Accessories(name: String, quantity: Int): MusicalGoods(name, quantity){}

interface searchForAppropriateAccessories{
    fun search(){
        println("Выполняется поиск")
    }
}

fun main(){
    val guitar = Instruments("гитара",15)
    guitar.search()
}