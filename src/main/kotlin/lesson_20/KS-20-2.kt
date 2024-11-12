package org.example.lesson_20

class Player(
    val name: String,
    var currentHealthj: Int,
    val maxHealth: Int = 100,
)

fun main() {
    val healing: (Player) -> Unit

    healing = { player: Player ->
        println("лечебное зелье востановило у игрока ${player.name} со здоровьем ${player.currentHealthj} до максимальной")
        player.currentHealthj = player.maxHealth
    }

    val player1 = Player("Джимми Узкогор", 23)
    println("здоровье игрока  ${player1.name}: ${player1.currentHealthj}")
    println()
    healing(player1)
    println()
    println("здоровье игрока  ${player1.name}: ${player1.currentHealthj}")


}