package org.example.lesson_5

fun main() {
    val randomNumber1 = 5
    val randomNumber2 = 7

    println("Вам нужно угадать два числа от 0 до 42, напишите их")
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    if ((randomNumber1 == number1) and (randomNumber2 == number2))  println("Поздравляем! Вы выиграли главный приз!")
    else if ((randomNumber1 == number1) or (randomNumber2 == number2))  println("Вы выиграли утешительный приз!")
    else println("Неудача!")
}
