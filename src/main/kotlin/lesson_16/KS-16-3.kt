package org.example.lesson_16

class User(
    private val login: String,
    private val password: String,
) {
    fun passwordVerification( passCheck: String) {
        var verification = passCheck == password
        println(verification)
    }
}

fun main (){
    val user = User("давид","космос42")
    user.passwordVerification("космос41")
}
