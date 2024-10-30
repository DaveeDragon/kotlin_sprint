package org.example.lesson_17

class Package(
    val packageNumber: Int,

){
    var location: String = "Тбилиси"
        set(value: String){
            field = value
            movementCounter += 1
        }
    var movementCounter: Int = 5
}
   fun main(){
       val package1 = Package(213313)
       println(package1.movementCounter)
       package1.location = "Сочи"
       println(package1.movementCounter)
   }
