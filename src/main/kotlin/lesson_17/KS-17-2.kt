package org.example.lesson_17

 class Ship(
     var averageSpeed: Int,
     var homePort: String,
 ){
     var name: String = "Катрина"
         set(value){
             println("Имя корабля менять нельзя!")
         }
 }
fun main(){
    val ship = Ship(35, "Стокланд")
    ship.name = "Бухенвальд"
}