package org.example.lesson_17

class Quiz(
    question: String,
    answer: String,
){
    val _question = question
        get() = field
    var _answer = answer
        get() = field
        set(value: String){
            field = value
        }
}
fun main(){
    val quiz = Quiz("какого цвета мой глаз?", "боб мы слепые")
    println(quiz._question)
    quiz._answer = "карие боб..карие"
    println(quiz._answer)
}