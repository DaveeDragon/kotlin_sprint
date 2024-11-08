package org.example.lesson_19

enum class Gender(var genName: String) {
    MAN("мужской"),
    WOMAN("женский"),
}
class Human() {
    val name = readln()
    var gender = readln()
    init {
        println("Вводите")
        when (gender) {
            Gender.MAN.genName -> gender = Gender.MAN.genName
            Gender.WOMAN.genName -> gender = Gender.WOMAN.genName
        }

    }
}

fun main () {
    println("Вводите по очереди имя человека и его пол:\n имя - кирилицей, а пол - либо мужской либо женский")

    val human1 = Human()
    val human2 = Human()
    val human3 = Human()
    val human4 = Human()
    val human5 = Human()

    val listOfPeople = mutableListOf<Human>()

    listOfPeople.add(human1)
    listOfPeople.add(human2)
    listOfPeople.add(human3)
    listOfPeople.add(human4)
    listOfPeople.add(human5)
    println()
    println("Имена и пол людей в картотеке:")
    listOfPeople.forEach(){
        println(it.name)
        println(it.gender)
        println()
    }

}