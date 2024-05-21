package org.example.lesson_2


fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val buff = 0.2

    val buffCrystalOre: Int = (crystalOre * buff).toInt()
    val buffIronOre: Int = (ironOre * buff).toInt()

    println("бонусная кристалическая руда: $buffCrystalOre")
    println("бонусная железная руда: $buffIronOre")
}
