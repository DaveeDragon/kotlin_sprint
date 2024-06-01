package org.example.lesson_4

 fun main(){
     val shipNoInjured = readLine().toBoolean()
     val numberOfCrew: Int = readLine()!!.toInt()
     val quantityOfProvisions: Int = readLine()!!.toInt()
     val weatherIsFavorable = readLine().toBoolean()

     val conditionsNoInjured = true
     val minCrewNumber = 55
     val maxCrewNumber = 70
     val conditionProvisionsQuantity = 50
     val conditionFavorableWeather = true

     println("Научно-исследовательский корабль может приступить к долгосрочному плаванию: ${(((shipNoInjured == conditionsNoInjured)and(numberOfCrew < maxCrewNumber) and (numberOfCrew > minCrewNumber) and (quantityOfProvisions > conditionProvisionsQuantity)and(weatherIsFavorable == conditionFavorableWeather)) || ((numberOfCrew == maxCrewNumber) and (quantityOfProvisions > conditionProvisionsQuantity) and (weatherIsFavorable == conditionFavorableWeather)))}")
 }