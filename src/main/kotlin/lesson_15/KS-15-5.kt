package org.example.lesson_15


class Trucks(): Moveable{
    val maxPassengerQuantity = 1
    val maxLoadWeight = 2

    override fun Load(passengersQuantity: Int, loadWeight: Int) {
        if (passengersQuantity != 0)
            println("грузовой автомобиль перевозит $maxPassengerQuantity пассажиров" )
        println("грузовой автомобиль перевозит $maxLoadWeight тон груза" )
    }
}

class PassengerCars(): Moveable{
    val maxPassengerQuantity = 3
    override fun Load(passengersQuantity: Int, loadWeight: Int) {
        if (passengersQuantity != 1)
            println("грузовой автомобиль перевозит $maxPassengerQuantity пассажиров" )
        else println("грузовой автомобиль перевозит 1 пассажира")
    }
}

interface Moveable { fun Load(passengersQuantity: Int, loadWeight: Int, ) }
fun main(){
    val truck = Trucks()
    val passengerCar = PassengerCars()

    passengerCar.Load(6,2)
    passengerCar.Load(3,2)
    truck.Load(0, 2)

}