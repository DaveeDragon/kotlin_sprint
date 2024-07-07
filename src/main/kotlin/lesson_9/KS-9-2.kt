package lesson_9

fun main(){
    val listOfIngridients = mutableListOf("пельмень", "масло", "сыр")
    println("В рецепте есть базовые ингредиенты: $listOfIngridients")

    println("Желаете добавить еще?")
    val answer = readln()
    if (answer == "да"){
        println("Какой ингредиент вы хотите добавить?")
        val added = readln()
        listOfIngridients.add(added)
    }
    else
        return

    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngridients")
}