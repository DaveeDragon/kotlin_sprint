package org.example.lesson_15

interface Moveable {
    fun move() {
        println("транспортное средство переместилоссь")
    }
}

interface PassengerTransportation{
    fun loadPassengers(passengersQuantity: Int,) {}

    fun unloadPassengers() {}
}


interface CargoTransportation{
    fun loadCargo(loadCargo: Int,) {}

    fun unloadCargo() {}
}


class Trucks(): Moveable, CargoTransportation, PassengerTransportation {
    private val maxPassengers = 1
    private val maxCargo = 2

    override fun loadPassengers (passengersQuantity: Int,) {
        if (passengersQuantity != 0)
            println("грузовик загрузил $maxPassengers пассажира, осталось ${passengersQuantity - maxPassengers} пассажиров")
        else println("пассажиров нет")
    }

    override fun unloadPassengers () {
            println("грузовик разгрузил $maxPassengers пассажиров")
    }

    override fun loadCargo (loadCargo: Int,) {
        if (loadCargo != 0)
            println("грузовик загрузил $maxCargo тонны груза, осталось  ${loadCargo - maxCargo} тонн")
        else println("груза нет")
    }

    override fun  unloadCargo () {
            println("грузовик разгрузил $maxCargo тонны")

    }
}


class PassengerCars(): Moveable, PassengerTransportation {
    private val maxPassengers = 3
    override fun loadPassengers (passengersQuantity: Int,) {
        if (passengersQuantity != 0)
            println("легковой автомобиль загрузил $maxPassengers пассажира, осталось ${passengersQuantity - maxPassengers} пассажиров")
        else println("пассажиров нет")
    }

    override fun unloadPassengers () {
        println("легковой автомобиль разгрузил $maxPassengers пассажиров")
    }
}

fun main(){
    val truck = Trucks()
    val car = PassengerCars()


    truck.loadCargo(2)
    truck.move()
    truck.unloadCargo()
    car.loadPassengers(0)

    println()
    car.loadPassengers(6)
    car.move()
    car.unloadPassengers()

    println()
    car.loadPassengers(3)
    car.move()
    car.unloadPassengers()
    car.loadPassengers(0)

    }
