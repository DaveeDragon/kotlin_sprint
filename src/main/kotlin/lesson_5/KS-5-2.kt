package org.example.lesson_5

fun main(){
    println("введите год рождения")
    val ageOfBirth = readLine()!!.toInt()
    val age = 2024 - ageOfBirth
    val permission = age >= 18
    if (permission)
        println("Показать экран со скрытым контентом")

    else
        println("Доступ запрещен")

}