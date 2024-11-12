package org.example.lesson_20

fun main() {
    val boringListOfString = listOf("не нажимаемый", "силы", "страха", "сех стихий")

    val click: (String) -> Unit
    click = { it: String ->
       println("Нажат элемент $it")
    }

    val funListOfString = boringListOfString.map{
        click(it)
    }
}