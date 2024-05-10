package org.example.lesson_2


fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11

    val buffCrystalOre: Int = (crystalOre * 0.2).toInt()
    val buffIronOre: Int = (ironOre * 0.2).toInt()

    println("бонусная кристалическая руда: $buffCrystalOre")
    println("бонусная железная руда: $buffIronOre")
}
