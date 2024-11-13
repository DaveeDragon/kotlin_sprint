package org.example.lesson_21

class ListOfNumbers(
    val list: List<Int>
){

}

fun ListOfNumbers.evenNumbersSum(){
    var sum: Int = 0
    list.forEach{
        if (it % 2 == 0)
            sum += it
    }
    println(sum)
}

fun main() {
    val listOfNumber = ListOfNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    listOfNumber.evenNumbersSum()
}