package org.example.lesson_1

fun main(){
    val seconds: Int = 6480
    val lostSecond: Int = seconds % 60
    val lostMinutes: Int = (seconds % 3600)/60

    println("0${6480/3600}:${lostMinutes}:0${lostSecond}")
}