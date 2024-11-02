package org.example.lesson_18

import kotlin.random.Random

abstract class Dice(
    val sides: Int
){
    open fun throwDice(){}
}

class FourSidedDice(sides: Int):Dice(sides){
    override fun throwDice(){ println("Выпало грань - ${(1..sides).random()}") }
}
class SixSidedDice(sides: Int):Dice(sides){
    override fun throwDice() {println("Выпало грань - ${(1..sides).random()}") }
}
class EightSidedDice(sides: Int):Dice(sides){
    override fun throwDice(){println("Выпало грань - ${(1..sides).random()}") }
}
fun showDices(dices: List<Dice>){
    dices.forEach{
        it.throwDice()
    }

}
fun main(){
    val dice1 = FourSidedDice(4)
    val dice2 = SixSidedDice(6)
    val dice3 = EightSidedDice(8)

    val diceList = listOf<Dice>(dice1, dice2, dice3)
    showDices(diceList)

}
