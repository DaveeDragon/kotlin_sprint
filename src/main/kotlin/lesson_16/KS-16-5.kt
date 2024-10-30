package org.example.lesson_16

class Player(val name: String, ){
    private var health = 10
    var punchDamageScore = 5

    fun Health(){
        val player = Player("")

        println("здоровье игрока - ${player.health}")
    }
    private fun Death(){
        val player = Player(" ")
        println("игрока ${player.name} убили")
        health = 0
        punchDamageScore = 0
    }

    fun Punch(punchPoints: Int): Int {
        val player = Player(" ")

        return punchPoints
        println("игрок ${player.name} нанес $punchPoints урона")
    }

    fun Healing(healingPoints: Int){
        val player = Player(" ")

        if (health != 0){
            health += healingPoints
            println("игрок ${player.name} залечил немного раны - ${health}")}
        else println("игроку ${player.name} умер, лечения не поможет")
    }

    fun TakingDamage(damagePoints: Int){
        val player = Player(" ")

        if (player.health > damagePoints){
            player.health -= damagePoints
            println("игроку ${player.name} нанесли $damagePoints урона - ${player.health}")
        }
        else if (player.health == damagePoints){player.Death()}
        else println("игрок ${player.name} уже умер")
    }
}
fun main(){
    val player = Player("Венгер восьмой")

    player.Health()
    player.TakingDamage(1)
    player.Health()
    player.Healing(3)
}