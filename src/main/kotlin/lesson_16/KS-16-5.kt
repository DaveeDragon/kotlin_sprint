package org.example.lesson_16

import kotlin.random.Random

class Player(
    val name: String,
){
    val punchDamageScore = Random.nextInt(1,10)
    private var health = Random.nextInt(1,10)

    fun Punch(){
        println("игрок нанес урон")
    }
    fun Healing(){
        println("игрок залечил немного раны")
        health += 1
    }
    fun Damage(){
        println("игрока ранили")
        health -= 1
    }


}