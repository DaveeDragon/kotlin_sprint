package org.example.lesson_4

fun main(){
    var weight =  20
    var volume = 80
   println("Груз с весом $weight кг и объемом $volume л соответствует категории Average: ${(35 < weight) and (weight < 100) and (volume < 100)}")

    weight =  50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(35 < weight) and (weight < 100) and (volume < 100)} ")


}