package org.example.lesson_6

fun main (){
    println("Введите сколько секунд надо засечь")
    val seconds = readln().toInt()
    var counter = seconds
    while(counter > 0){
        counter--
        Thread.sleep(1000)
    }
    println("Прошло $seconds секунд")
}