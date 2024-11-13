package org.example.lesson_21

class Player(
    val name: String,
    val currentHealth: Int,
    val maxHealth: Int = 100,
)

fun Player.isHealthy(){
    val isHealthy = currentHealth == maxHealth
    println(isHealthy)
}

fun main() {
    val player1 = Player("Иван Патлатый", 23)
    player1.isHealthy()

    val player2 = Player("Иван Подстриженный", 100)
    player2.isHealthy()
}