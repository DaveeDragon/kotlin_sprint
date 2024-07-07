package lesson_9

fun  main(){
    val ingridientsList = listOf("соль", "пельмень", "сливочное масло", "сыр", "зелень")
    println("В рецепте есть следующие ингредиенты: ")
    ingridientsList.forEach { println(it) }

}
