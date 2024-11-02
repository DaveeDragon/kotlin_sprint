package org.example.lesson_15

interface Moveable {
    fun Load(
        name: String,
        _maxLoadWeight: Int,
        _maxPassengerQuantity: Int,
        passengersQuantity: Int,
        loadWeight: Int,

        ) {
        val weightDifference = loadWeight - _maxLoadWeight
        val passangersDifference = passengersQuantity - _maxPassengerQuantity
        when (passengersQuantity) {
            0 -> {
                when (loadWeight) {
                    1 -> println("$name перевозит $passengersQuantity пассажира и $loadWeight тон груза" +
                            "\nвсех пассажир и груз перевезли")

                    2 ->  println("$name  перевозит $passengersQuantity пассажира и $loadWeight тон груза" +
                            "\nвсех пассажир и груз перевезли")

                    else -> println("$name  перевозит $_maxLoadWeight тон груза \n" +
                            "всех пассажиров перевезли, осталось ${weightDifference} тон груза")
                }
            }

            1 -> {
                when (loadWeight) {
                    1 ->  println("$name  автомобиль перевозит $passengersQuantity пассажира и $loadWeight тон груза" +
                            "\nвсех пассажир и груз перевезли")

                    2 ->  println("$name  автомобиль перевозит $passengersQuantity пассажира и $loadWeight тон груза" +
                            "\nвсех пассажир и груз перевезли")

                    else ->  println("$name автомобиль перевозит $passengersQuantity пассажира и $_maxLoadWeight тон груза " +
                            "\nвсех пассажиров перевезли, осталось ${weightDifference} тон груза")
                }
            }

            2 -> {
                when (loadWeight) {
                    1 ->  println("$name перевозит $passengersQuantity пассажира и $loadWeight тон груза" +
                            "\nвесь груз перевезли, Осталось $passangersDifference пассажиров")

                    2 ->  println("$name перевозит $passengersQuantity пассажира и $loadWeight тон груза" +
                            "\nвесь груз перевезли, Осталось $passangersDifference пассажиров")

                    else ->  println("$name перевозит $passengersQuantity пассажира и $_maxLoadWeight тон груза " +
                            "\nОсталось $weightDifference тон груза и $passangersDifference пассажиров")
                }
            }

            else -> {
                when (loadWeight) {
                    1 ->  println("$name перевозит $passengersQuantity пассажира и $loadWeight тон груза" +
                            "\nОсталось $passangersDifference пассажиров")

                    2 ->  println("$name перевозит $passengersQuantity пассажира и $loadWeight тон груза" +
                            "\nвесь груз перевезли, Осталось $passangersDifference пассажиров")

                    else ->  println("$name перевозит $passengersQuantity пассажира и $_maxLoadWeight тон груза " +
                            "\nОсталось $weightDifference тон груза и $passangersDifference пассажиров")
                }
            }

        }
    }
}

class Trucks(): Moveable {}
class PassengerCars(): Moveable {}

fun main(){
    val truck = Trucks()
    val passengerCar = PassengerCars()

    passengerCar.Load("легковой автомобиль", 0, 3, 6,2)
    println()
    passengerCar.Load("легковой автомобиль", 0, 3, 3,2)
    println()
    truck.Load("легковой автомобиль", 2, 0, 0,2)
    }
