package org.example.lesson_4

fun main(){
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    var weight =  20
    var volume = 80
   println("Груз с весом $weight кг и объемом $volume л соответствует категории Average: ${(minWeight < weight) and (weight <= maxWeight) and (volume < maxVolume)}")

    weight =  50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(minWeight < weight) and (weight <= maxWeight) and (volume < maxVolume)} ")


}