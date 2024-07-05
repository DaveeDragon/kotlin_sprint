package org.example.lesson_6

fun main(){
    val number1 = 3
    println("Угадайте число в промежутке 1 до 9")
    do
    {
        val numberTry1 = readln().toInt()
        val verification = number1 == numberTry1
        if (verification == true){
            println("Это была великолепная игра!")
            break
        }
        else{
            println("Неверно")
        }
    } while(!verification)
    println("Было загадано число $number1")
}