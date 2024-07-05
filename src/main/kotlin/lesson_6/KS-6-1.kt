package org.example.lesson_6

fun main() {
    println("Cоздайте свой логин и пароль для аккаунта:")
    val login = readln()
    val password = readln()

    do{
        println("Введите логин и пароль повторно")
        val loginRepeat = readln()
        val passwordRepeat = readln()

        val verification = ((login == loginRepeat) and (password == passwordRepeat))

    } while(!verification)
    println("Авторизация прошла успешно")
}
