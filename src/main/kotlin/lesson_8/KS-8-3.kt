package lesson_8

fun main(){
    val arrayRecept = arrayOf("яйцо", "сосиски", "зелень", "сыр", "приправы", "соль")
    println("Какой ингридиент ты хочешь проверить, господин: ")
    val wantsToKnow = readln()
    if(arrayRecept.contains(wantsToKnow)) {
            println("Ингредиент $wantsToKnow в рецепте есть")
    }
        else {
        println("Такого ингредиента в рецепте нет")
    }
}