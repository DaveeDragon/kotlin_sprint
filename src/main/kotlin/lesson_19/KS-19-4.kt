package org.example.lesson_19

enum class Bullets(var damage: Int) {
    NOTHING(0),
    BLUE(5),
    GREEN(10),
    RED(20);
}

class Tank(){
    var bullet = Bullets.NOTHING
    fun bulletChange(bulletName: Bullets) {
        when(bulletName){
            Bullets.BLUE -> bullet = Bullets.BLUE
            Bullets.GREEN -> bullet = Bullets.GREEN
            Bullets.RED -> bullet = Bullets.RED
            else -> bullet = Bullets.NOTHING
        }
    }
    fun shot() {
        if (bullet.damage > 0)
            println("вы нанесли ${bullet.damage} урона")
        else println("танк не заряжан")
    }
}
fun main() {
    val tank1 = Tank()
    tank1.shot()
    println()
    tank1.bulletChange(Bullets.BLUE)
    tank1.shot()
    println()
    tank1.bulletChange(Bullets.RED)
    tank1.shot()

}
