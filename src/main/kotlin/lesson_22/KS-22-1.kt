package org.example.lesson_22

class RegularBook(
    val name: String,
    val author: String,
){}

data class DataBook(
    val name: String,
    val author: String,
){}

fun main(){
    val regularBook1 = RegularBook("Антонио и его жизнь", "Антонио Е.П.")
    val regularBook2 = RegularBook("Антонио и его жизнь", "Антонио Е.П.")

    val dataBook1 = DataBook("Жозе: Авантюра", "Антонио Е.П.")
    val dataBook2 = DataBook("Жозе: Авантюра", "Антонио Е.П.")

    println(regularBook1 == regularBook2)
    //  в случае обычных классов сравнение подобным образом подразмивает
    //  сравнение ссылок на обьекты, что даже при одинаковых переменных выдает false
    println(dataBook1 == dataBook2)
    //в случае с дата классами, сравниваются значение, и тут все правильно - true

}