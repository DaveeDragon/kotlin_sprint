package org.example.lesson_22

class RegularBook2(
    val name: String,
    val author: String,
)

data class DataBook2(
    val name: String,
    val author: String,
)

fun main() {
    val regularBook1 = RegularBook2("Антонио и его жизнь", "Антонио Е.П.")
    val dataBook1 = DataBook2("Жозе: Авантюра", "Антонио Е.П.")

    println(regularBook1)
    println(dataBook1)
    //при обычных классах выводиться ссылка, а при дата классов уже сами значения обьекта
}

