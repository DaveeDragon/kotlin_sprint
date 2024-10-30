package org.example.lesson_15


class Trucks(): Moveable{
    val maxPassengerQuantity = 1
    val maxLoadWeight = 2
// логика грузовых автомобилей
    override fun Load(passengersQuantity: Int, loadWeight: Int) {
        val weightDifference = loadWeight - maxLoadWeight
        val passangersDifference = passengersQuantity - maxPassengerQuantity
        if (( passengersQuantity > 1) and ( loadWeight > 2)){
            println("грузовой автомобиль перевозит $maxPassengerQuantity пассажиров и $maxLoadWeight тон груза" )
            println("осталось ${passangersDifference} пассажиров" +
                    " и ${weightDifference} тон груза")
        }
       else if (( passengersQuantity == 1) and ( loadWeight > 2)){
            println("грузовой автомобиль перевозит $maxPassengerQuantity пассажиров и $maxLoadWeight тон груза" )
            println("всех пассажир перевезли осталось ${weightDifference} тон груза")
        }
       else if((passengersQuantity == 0) and (loadWeight > 2 )){
            println("грузовой автомобиль перевозит $maxLoadWeight тон груза")
            println("всех пассажиров перевезли, осталось ${weightDifference} тон груза")
        }
        else if((passengersQuantity == 0) and (loadWeight == 2)){
            println("грузовой автомобиль перевозит $maxLoadWeight тон груза")
            println("все пассажиры и груз перевезли")
        }
        else if ((passengersQuantity == 0) and (loadWeight == 1)){
            println("грузовой автомобиль перевозит 1 тон груза")
            println("всех пассажир и груз перевезли")
        }
        else{
            println("всех пассажир и груз перевезли")
        }
    }
}

class PassengerCars(): Moveable{
    val maxPassengerQuantity = 3
    //логика легковых автомобилей
    override fun Load(passengersQuantity: Int, loadWeight: Int) {
        val passangersDifference = passengersQuantity - maxPassengerQuantity
        if ((passengersQuantity > 3) and (loadWeight != 0)){
            println("легковой автомобиль перевозит $maxPassengerQuantity пассажиров" )
            println("осталось ${passangersDifference} пассажиров и $loadWeight тон груза")
        }
        else if ((passengersQuantity == 3) and (loadWeight != 0)){
            println("легковой автомобиль перевозит 2 пассажир")
            println("всех пассажиров перевезли, осталось $loadWeight  тон груза")
        }
        else if ((passengersQuantity == 2) and (loadWeight != 0)){
            println("легковой автомобиль перевозит 2 пассажир")
            println("всех пассажиров перевезли, осталось $loadWeight  тон груза")
        }
        else if ((passengersQuantity == 1) and (loadWeight != 0)){
            println("легковой автомобиль перевозит 1 пассажир")
            println("всех пассажиров перевезли, осталось $loadWeight  тон груза")
        }
        else if ((passengersQuantity == 0) and (loadWeight != 0)){
            println("осталось $loadWeight тон груза")
        }
        else{println("всех пассажир и груз перевезли")}
    }
}

interface Moveable { fun Load(passengersQuantity: Int, loadWeight: Int, ) }

fun main(){
    val truck = Trucks()
    val passengerCar = PassengerCars()

    passengerCar.Load(6,2)
    println()
    passengerCar.Load(3,2)
    println()
    truck.Load(0, 2)

}