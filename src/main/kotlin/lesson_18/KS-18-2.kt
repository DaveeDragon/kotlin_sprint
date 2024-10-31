package org.example.lesson_18

import kotlin.random.Random

open class Dice(){
    open fun throwDice(){}
}

class FourSidedDice():Dice(){
    override fun throwDice(){ println("Выпало грань - ${Random.nextInt(1,5)}") }
}
class SixSidedDice():Dice(){
    override fun throwDice() {println("Выпало грань - ${Random.nextInt(1,7)}") }
}
class EightSidedDice():Dice(){
    override fun throwDice(){println("Выпало грань - ${Random.nextInt(1,9)}") }
}
fun showDices(dices: List<Dice>){
    dices.forEach{
        it.throwDice()
    }

}
fun main(){
    val dice1 = FourSidedDice()
    val dice2 = SixSidedDice()
    val dice3 = EightSidedDice()

    val diceList = listOf<Dice>(dice1, dice2, dice3)
    showDices(diceList)

}
