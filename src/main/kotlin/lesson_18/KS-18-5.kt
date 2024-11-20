package org.example.lesson_18

open class Screen() {
    fun drawCircle( x: Int, y: Int) {
        println("нарисован круг с координами $x и $y")
    }
    fun drawCircle( x: Float, y: Float) {
        println("нарисован круг с координами $x и $y")
    }

    fun drawSquare( x: Int, y: Int) {
        println("нарисован квадрат с координами $x и $y")
    }

    fun drawSquare( x: Float, y: Float) {
        println("нарисован квадрат с координами $x и $y")
    }


    fun drawDot(x: Int, y: Int) {
        println("нарисован квадрат с координами $x и $y")
    }

    fun drawDot(x: Float, y: Float) {
        println("нарисован квадрат с координами $x и $y")}

}

fun main() {
    val screen = Screen()
    screen.drawCircle(3,5)
    screen.drawSquare(4,4)
    screen.drawDot(7, 7)
    println()
    screen.drawCircle(2.45f, 3.12f)
    screen.drawSquare(1.56f,-4.6573f)
    screen.drawDot(-23.657f, 8.324f)
}


