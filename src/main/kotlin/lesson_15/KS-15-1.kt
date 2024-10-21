package org.example.lesson_15

interface Flying {
    fun FirstMethodOfMovement()
}

interface Swimming{
    fun SecondMethodOfMovement()
}

class Crucian(): Swimming{
    override fun SecondMethodOfMovement() {
    println("карась плавает")
    }
}

class Seagull(): Flying{
    override fun FirstMethodOfMovement() {
        println("чайка летит")
    }
}

class Duck(): Flying,Swimming{
    override fun FirstMethodOfMovement() {
        println("утка летит")
    }

    override fun SecondMethodOfMovement() {
        println("утка плавает")
    }
}
fun main(){
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.SecondMethodOfMovement()
    println()
    seagull.FirstMethodOfMovement()
    println()
    duck.FirstMethodOfMovement()
    duck.SecondMethodOfMovement()
}