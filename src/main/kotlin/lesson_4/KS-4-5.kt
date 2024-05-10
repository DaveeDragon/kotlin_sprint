package org.example.lesson_4

 fun main(){
     val shipNoInjured = readLine().toBoolean()
     val numberOfCrew: Int = readLine()!!.toInt()
     val quantityOfProvisions: Int = readLine()!!.toInt()
     val weatherIsFovorable = readLine().toBoolean()

     println("Научно-исследовательский корабль может приступить к долгосрочному плаванию: ${((shipNoInjured)and(numberOfCrew<70)and(numberOfCrew>50)and(quantityOfProvisions>50)and(weatherIsFovorable))||((!shipNoInjured)and(numberOfCrew==70)faand(quantityOfProvisions>50)and(weatherIsFovorable))}")
 }