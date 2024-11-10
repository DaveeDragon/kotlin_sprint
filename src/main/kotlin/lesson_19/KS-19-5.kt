package org.example.lesson_19

enum class Gender(var genName: String) {
    MAN("мужской"),
    WOMAN("женский"),
}
class Human() {
    var name = ""
    var gender = ""

    fun addPerson() {
        println("Вводите")
        name = readln()
        gender = readln()

        if (gender.equals( Gender.MAN.genName, ignoreCase = true))
            gender = Gender.MAN.genName

        else if (gender.equals( Gender.WOMAN.genName, ignoreCase = true))
            gender = Gender.WOMAN.genName

        else
            error("неправильно ввели пол")
    }
}



fun main () {
    println("Вводите по очереди имя человека и его пол:\n имя - кирилицей, а пол - либо мужской либо женский")
    val human1 = Human()
    val human2 = Human()
    val human3 = Human()
    val human4 = Human()
    val human5 = Human()
    human1.addPerson()
    human2.addPerson()
    human3.addPerson()
    human4.addPerson()
    human5.addPerson()


    val listOfPeople = mutableListOf<Human>()
    listOfPeople.add(human1)
    listOfPeople.add(human2)
    listOfPeople.add(human3)
    listOfPeople.add(human4)
    listOfPeople.add(human5)
    if (listOfPeople.size > 4) {
        println("Имена и пол людей в картотеке:")
        listOfPeople.forEach() {
            println(it.name)
            println(it.gender)
            println()

        }
    }
}




