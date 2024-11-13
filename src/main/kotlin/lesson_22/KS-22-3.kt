package org.example.lesson_22

data class Something(
    val name: String,
    val source: String,
    val age: Int,
)

fun main() {
    val thing1 = Something("чудо благородное", "небеса", 5)
    println(thing1.name)
    println(thing1.source)
    println(thing1.age)
}
