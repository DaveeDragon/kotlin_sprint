package org.example.lesson_21

open class Player(override val map: Map<String, Int>) :Skills

interface Skills{
    val map: Map<String, Int>
}

fun Skills.maxCategory(){
    val maxValue = map.maxBy { it.value }
    val maxValueSkill = maxValue.key
    println("навык с самым большим опытом: $maxValueSkill")
}


fun main() {
    val player = Player(mapOf("скорость бега" to 6, "сила удара" to 7, "интеллект" to 9))
    player.maxCategory()

    val player1 = Player(mapOf("скорость бега" to 9, "сила удара" to 7, "интеллект" to 9))
    player1.maxCategory()
}