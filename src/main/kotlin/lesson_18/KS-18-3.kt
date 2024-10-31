package org.example.lesson_18

open class Animal(val name: String){
    open fun Feeding(){}
}

class Cat(name: String): Animal(name) {
    override fun Feeding(){
        println("$name ест рыбу")
    }
}
class Dog (name: String): Animal(name) {
    override fun Feeding(){
        println("$name ест кости")
    }
}
class Fox(name: String): Animal(name) {
    override fun Feeding(){
        println("$name ест ягоды")
    }
}
fun FeedingList(animals: List<Animal>){
    animals.forEach{
        it.Feeding()
    }
}
fun main(){
    val cat = Cat("Кот")
    val dog = Dog("Собака")
    val foxy = Fox("Лиса")

    val animalList = listOf<Animal>(cat, dog, foxy)
    FeedingList(animalList)
}
