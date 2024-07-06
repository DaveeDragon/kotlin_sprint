package org.example.lesson_7

fun main(){
    val signUpNumber = 1000..9999
    var number = signUpNumber.random()
    println("Ваш код авторизации: ${number}")

    println("Введите код авторизации:")
    var checkNumber = readln().toInt()
    var verification = checkNumber == number

        while (!verification) {
            number = signUpNumber.random()
            println("Ваш код авторизации: ${number}")

            println("Введите код авторизации:")
            checkNumber = readln().toInt()
            verification = checkNumber == number
        }
    println("Добро пожаловать")

}
