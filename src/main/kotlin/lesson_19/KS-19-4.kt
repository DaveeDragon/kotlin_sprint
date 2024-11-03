package org.example.lesson_19

enum class Bullets(val damage: Int){
    BLUE(5),
    GREEN(10),
    RED(20),
}
fun  bulletChanging(bullets: Bullets){
    when(bullets){
        Bullets.BLUE -> println("патроны сменились на синие")
        Bullets.GREEN-> println("патроны сменились на зеленые")
        Bullets.RED-> println("патроны сменились на красные")
    }
}
class Tank(){
    var bulletDamage: Int = 0
    fun bulletChange(bulletName: Bullets){
        bulletChanging(bulletName)
        when(bulletName){
            Bullets.BLUE -> bulletDamage = Bullets.BLUE.damage
            Bullets.GREEN -> bulletDamage = Bullets.GREEN.damage
            Bullets.RED -> bulletDamage = Bullets.GREEN.damage
        }
    }
    fun shot(){
        if (bulletDamage > 0)
            println("вы нанесли $bulletDamage урона")
        else println("танк не заряжан")
    }
}
fun main(){
    val tank1 = Tank()
    tank1.shot()
    println()
    tank1.bulletChange(Bullets.BLUE)
    tank1.shot()
    println()
    tank1.bulletChange(Bullets.RED)
    tank1.shot()

}
