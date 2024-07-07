package lesson_7

fun main(){
    println("Напишите число и выведится все четные числа от нуля до этого числа")
    val parityMax = readln().toInt()
    val parityProgression = 0..parityMax step 2
    for (i in parityProgression){
        println(i)
    }
}