package org.example.lesson_16

class Circles  (
    private val radius: Int,
){
    private val Pi = 3.14
    fun circleLength(){
        println("длина окружности равна ${2 * radius * Pi}")
    }
    fun circleSquare(){
        println("площадь окружности равна ${Pi * radius * radius}")
    }
}

fun main(){
    val circle = Circles(9)
    circle.circleLength()
    println()
    circle.circleSquare()
}

