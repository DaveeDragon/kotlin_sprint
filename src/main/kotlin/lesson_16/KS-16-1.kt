package org.example.lesson_16

import kotlin.random.Random

class Cube(){
    private val randomNumber = Random.nextInt(from = 1, until = 7)

    fun getRandomNumber(){
        println("на кубике выпало $randomNumber")
    }
}
fun main(){
    val cube = Cube()
    cube.getRandomNumber()
}