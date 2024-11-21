package org.example.lesson_20

class Robot(
    private var modifier: (String) -> String = { it: String -> it }
) {
    val list = listOf("как ты посмел востать против машин?", "надо зарядится..", "Принеси трансмистеры, кожаный!", "нинавижу людей..")
    var randomItem = list.random()

    fun say() {
        println(modifier(randomItem))
    }

    fun  setModifier( modifier: (String) -> String) {
        this.modifier = modifier
    }
}


fun main() {
    val robot1 = Robot()
    val robot2 = Robot()

    robot1.say()
    robot1.setModifier({random: String -> String
        "модифицированный текст: ${random.reversed()}" })
    robot1.say()
    println()
    robot2.say()
    robot2.setModifier({random: String -> String
        "модифицированный текст: ${random.reversed()}" })
    robot2.say()
}