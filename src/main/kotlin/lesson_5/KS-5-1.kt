package org.example.lesson_5

fun main(){
    println(" Докажите что вы не бот решив это простое выражение:   2+2=...")
    val summ = readln().toInt()
    val isNotBot = (summ == 4)
    println(isNotBot)
    if (isNotBot) {
        println("Добро пожаловать!!!")
    }
    else{
        println("Доступ запрещен")
    }
}