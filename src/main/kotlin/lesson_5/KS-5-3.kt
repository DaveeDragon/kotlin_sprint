package org.example.lesson_5

fun main() {
    val a = 5
    val b = 7

    println("Вам нужно угадать два числа от 0 до 42, напишите их5")
    val a1 = readLine()!!.toInt()
    val b1 = readLine()!!.toInt()
    if ((a1 == a) and (b1 == b))  println("Поздравляем! Вы выиграли главный приз!")
    else if ((a1 == a) or (b1 == b))  println("Вы выиграли утешительный приз!")
    else println("Неудача!")
}
