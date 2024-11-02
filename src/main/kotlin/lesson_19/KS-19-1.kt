package org.example.lesson_19

enum class Fish(val nameFish: String){
    GUPPY("Гуппи"),
    ANGELFISH("Скалярий"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main(){
     println("В аквариум вы можете добавить таких рыб как:")
     val listOfFish = listOf(Fish.GUPPY, Fish.ANGELFISH,Fish.GOLDFISH,Fish.SIAMESE_FIGHTING_FISH)
    for (i in listOfFish){
        println(i.nameFish)
    }
}

