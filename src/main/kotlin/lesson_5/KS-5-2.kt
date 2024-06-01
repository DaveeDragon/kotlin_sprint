package org.example.lesson_5

fun main(){2
    println("введите год рождения")
    val ageOfBirth = readLine()!!.toInt()
    val age = 2024 - ageOfBirth
    if (age >= 18){
        println("Показать экран со скрытым контентом")
    }
    else{
        println("Доступ запрещен")
    }
}