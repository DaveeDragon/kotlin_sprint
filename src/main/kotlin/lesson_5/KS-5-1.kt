package org.example.lesson_5

fun main(){
    println(" Докажите что вы не бот решив5 это простое выражение:   2+2=...")
    var a = readLine()!!.toInt()
    println("2+2=$a")
    if (a==4){
        println("Добро пожаловать!!!")
    }
    else{
        println("Доступ запрещен")
    }
}