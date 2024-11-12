package org.example.lesson_20

class DungeonPlayer(
    val isHaveKey: Boolean,
)

fun main() {
    val keyCheck: (DungeonPlayer) -> Unit

    keyCheck = { seeker: DungeonPlayer ->
        if (seeker.isHaveKey)
            println("Искатель открыл дверь")
        else println("Дверь заперта")
    }

    val seeker1 = DungeonPlayer(true)
    val seeker2 = DungeonPlayer(false)
    keyCheck(seeker1)
    keyCheck(seeker2)

}