package org.example.lesson_16

class Player(val name: String, ){
    private var health = 10
    var punchDamageScore = 5

    private fun Death(){
        println("игрока $name убили")
        health = 0
        punchDamageScore = 0
    }

    fun Healing(healingPoints: Int){
        if (health != 0){
            health += healingPoints
            println("игрок $name залечил немного раны - $health здоровья осталось")}
        else println("игроку $name умер, лечения не поможет")
    }

    fun TakingDamage(damagePoints: Int){
        if (health > damagePoints){
            health -= damagePoints
            println("игроку $name нанесли $damagePoints урона - $health здоровья осталось")
        }
        else if (health == damagePoints){Death()}
        else println("игрок $name уже умер")
    }
}
fun main(){
    val player = Player("Венгер восьмой")
    val player1 = Player("Злой сосед Венгера восьмого")
    val player2 = Player("Добрый сосед Венгера восьмого")


    player.TakingDamage(4)

    player.Healing(3)
    println()
    player1.TakingDamage(4)
    player1.Healing(2)
    println()
    player2.TakingDamage(2)
    player2.Healing(3)


}