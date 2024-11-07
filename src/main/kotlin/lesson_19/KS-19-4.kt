package org.example.lesson_19

enum class Bullet(var damage: Int?) {
    BLUE(5),
    GREEN(10),
    RED(20);
}

class Tank(private var bullet: Bullet? = null){
    fun bulletChange(bulletName: Bullet) {
        when(bulletName){
            Bullet.BLUE -> bullet= Bullet.BLUE
            Bullet.GREEN -> bullet = Bullet.GREEN
            Bullet.RED -> bullet = Bullet.RED
        }
    }
    fun shot() {
        var isBulletNull = bullet == null
        if (!isBulletNull)
            println("вы нанесли ${bullet?.damage} урона")
        else println("танк не заряжан")
    }
}
fun main() {
    val tank1 = Tank()
    tank1.shot()
    println()
    tank1.bulletChange(Bullet.BLUE)
    tank1.shot()
    println()
    tank1.bulletChange(Bullet.RED)
    tank1.shot()

}
