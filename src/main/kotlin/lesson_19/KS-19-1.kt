package org.example.lesson_19

enum class Fish(val id: Int){
    GUPPY(1),
    ANGELFISH(2),
    GOLDFISH(3),
    SIAMESE_FIGHTING_FISH(4),
}
fun  showFishes(fish: Fish){
    when(fish){
        Fish.GUPPY -> println("Гуппи")
        Fish.ANGELFISH -> println("Скалярий")
        Fish.GOLDFISH -> println("Золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("Петушок")
    }
}

fun main(){
     println("В аквариум вы можете добавить таких рыб как:")
     val listOfFish = listOf(1, 2, 3, 4)
    for (i in listOfFish){
        when(i){
            Fish.GUPPY.id -> showFishes(Fish.GUPPY)
            Fish.ANGELFISH.id  -> showFishes(Fish.ANGELFISH)
            Fish.GOLDFISH.id -> showFishes(Fish.GOLDFISH)
            Fish.SIAMESE_FIGHTING_FISH.id  -> showFishes(Fish.SIAMESE_FIGHTING_FISH)
        }
        Thread.sleep(1000)
    }
}

