package org.example.lesson_4

fun main() {
    val TablesNumber = 13
    val FreeTablesToday = 0
    val FreeTablesTommorow = 4

    println("Доступность столиков на сегодня: ${(TablesNumber - FreeTablesToday) != TablesNumber}")
    println("Доступность столиков на сегодня: ${(TablesNumber - FreeTablesTommorow) != TablesNumber}")
}