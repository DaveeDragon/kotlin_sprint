package org.example.lesson_21

import kotlin.String


class String(
    val stringText: String,
){
}

fun String.vowelCount(){
    val string = String(" ")
    val vowel = string.stringText.vowelCount()
    println("количество гласных букв: $vowel")
}

fun main() {
    val string1 = String("Boo was scared, don't be afraid, I'm a friend, I won't hurt you")
    string1.vowelCount()
}
