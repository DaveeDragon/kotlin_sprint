package org.example.lesson_15


class Transportation(): Moveable

interface Moveable{
    fun Load(passengersQuantity: Int, loadWeight: Int,){
        if (loadWeight == 0) {
            for(i in (passengersQuantity/3) downTo 0)
            println(" легковой автомобиль перевозит пассажиров")
        }
        else if ((passengersQuantity == 1) and (loadWeight != 0))
            println("грузовой автомобиль перевозит пассажирв и груз")
        else{
            for (i in passengersQuantity downTo 3 step 3)
                println(" легковой автомобиль перевозит пассажиров")
            for(i in loadWeight downTo 2 step 2)
                println("грузовой автомобиль перевозит пассажирв и груз")
        }

    }
}
fun main(){
    val transportation = Transportation()
    transportation.Load(9,4)
}