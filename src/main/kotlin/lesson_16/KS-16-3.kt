package org.example.lesson_16

class User(
    private val login: String,
    private val password: String,
) {
    fun passwordValidate() {
        println("напишите пароль")
        do {
            var passCheck = readln()
            var verification = passCheck == password
            println(verification)
        } while (!verification)
    }
}

fun main (){
    val user = User("давид","космос42")
    user.passwordValidate()
}
