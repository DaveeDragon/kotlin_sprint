package org.example.lesson_18

abstract class Animal(val name: String){
    open fun feeding(){}

    open fun sleeping(){
        println("$name спит")
    }
}

class Cat(name: String): Animal(name) {
    override fun feeding(){
        println("$name ест рыбу")
    }
}
class Dog (name: String): Animal(name) {
    override fun feeding(){
        println("$name ест кости")
    }
}
class Fox(name: String): Animal(name) {
    override fun feeding(){
        println("$name ест ягоды")
    }
}
fun feedingList(animals: List<Animal>){
    animals.forEach{
        it.feeding()
        it.sleeping()
        println()
    }

}
fun main(){
    val cat = Cat("Кот")
    val dog = Dog("Собака")
    val foxy = Fox("Лиса")

    val animalList = listOf<Animal>(cat, dog, foxy)
    feedingList(animalList)
}
