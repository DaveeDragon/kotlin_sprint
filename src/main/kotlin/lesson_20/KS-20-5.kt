package org.example.lesson_20

class Robot(
    private var modifier: (String) -> String = { it }
) {
    val list = listOf("как ты посмел востать против машин?", "надо зарядится..", "Принеси трансмистеры, кожаный!", "нинавижу людей..")
    var randomItem = list.random()


    fun say() {
        println(randomItem)
    }
    fun  setModifier( text: (String) -> String) {
        modifier = text
    }
}


fun main() {
    val robot1 = Robot()
    val robot2 = Robot()
    val modifierRobotSay: (Robot) -> String
    modifierRobotSay = {robot: Robot ->
        "модифицированный текст: ${robot.randomItem.reversed()}"
    }

    robot1.say()
    robot1.setModifier(modifierRobotSay(robot1))
    robot1.say()
    println()
    robot2.say()
    robot2.setModifier(modifierRobotSay(robot2))
    robot2.say()
}