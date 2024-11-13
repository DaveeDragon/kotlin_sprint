package org.example.lesson_21

import java.io.File

fun File.addMessageInFile(
    word: String,
){
    createNewFile()
    val wordLow = word.toLowerCase()
    writeText(wordLow)
    println("Слово $wordLow добавлено в файл $name")
}


fun main() {
    val file = File("lesson.txt")
    file.addMessageInFile("ракушка")
}