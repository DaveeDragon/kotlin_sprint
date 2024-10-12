package org.example.lesson_14

abstract class Fiquire{
   abstract val color: String
   abstract fun areaCalculations()
   abstract fun perimeterCalculations()
}


class Circle(
    override val color: String,
    val radius: Int,
    val piNumber: Double = 3.14,
) : Fiquire(){
    var area: Double = 0.0
    var perimetr : Double = 0.0
    override fun areaCalculations() {
         area = piNumber * radius * radius
    }
    override fun perimeterCalculations() {
        perimetr = piNumber * piNumber * radius
    }
}


class Rectangle(
    override val color: String,
    val height: Int,
    val width: Int,
    ): Fiquire() {
    var area: Int = 0
    var perimetr : Int = 0
    override fun areaCalculations() {
       area = height * width
    }

    override fun perimeterCalculations() {
        perimetr = 2 * height + 2 * width
    }
}


fun main(){
    val black1 = Circle( "black", 5)
    val white1 = Rectangle("white",3, 4)
    val black2 = Circle( "black", 8)
    val white2 = Rectangle("white",7, 6)

    val listOfFiquires = mutableListOf(black1, white1, black2, white2)
    black1.perimeterCalculations()
    black2.perimeterCalculations()
    white1.areaCalculations()
    white2.areaCalculations()

    println("сумма периметров всех черных фигур равна ${black1.perimetr + black2.perimetr}")
    println()
    println("сумма площадей всех белых фигур равна ${white1.area + white2.area}")

}



