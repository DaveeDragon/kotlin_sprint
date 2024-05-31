package org.example.lesson_2


fun main() {
    val procentBuff = 20
    val buff = procentBuff * 0.1
    val crystalOre: Int = 7
    val ironOre: Int = 11


    val buffCrystalOre: Int = (crystalOre * buff).toInt()
    val buffIronOre: Int = (ironOre * buff).toInt()

    println("бонусная кристалическая руда: $buffCrystalOre")
    println("бонусная железная руда: $buffIronOre")
}
