package lesson_8

fun main(){
    val arrayOfIngridients = arrayOf("макароны", "вода", "соль", "сыр", "зелень", "котлеты", "масло")
    println("Рецепт вкусных макарон, нам нужны:")
    for (i in arrayOfIngridients) {
        println(i)
    }

    println("Сударь, изволите что нибудь поменять в рецепте? Напишите какой ингридиент")
    val toChange = readln()
    if (arrayOfIngridients.contains(toChange)) {
        println("на что, Господин?")
        val toSet = readln()
        arrayOfIngridients.set(arrayOfIngridients.indexOf(toChange), toSet)
        println("Готово! Вы сохранили следующий список: ")
        for(i in arrayOfIngridients)
        println(i)
    }
    else{
        println("Милорд, такого нету в нашем списке ай-ай")
    }



}