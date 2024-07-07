package lesson_8

fun main(){
    val arrayRecept = arrayOf("яйцо", "сосиски", "зелень", "сыр", "приправы", "соль")
    println("Какой ингридиент ты хочешь проверить, господин: ")
    val wantsToKnow = readln()
    for (i in arrayRecept){
        if(i == wantsToKnow) {
            println("Ингредиент $i в рецепте есть")
            break
        }
        else {
            println("Такого ингредиента в рецепте нет")
            break
        }
    }
}
