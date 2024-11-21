package org.example.lesson_17

class User(){
    var login: String = "Лаарон"
        set(value: String){
            field = value
            println("Логин успешно сменен")
        }
    var password: String = "12345"
        get() = {repeat(times = field.length){ "" + "*"}}.toString()

        set(value: String){
            field = value
            println("Вы не можете изменить пароль")
        }

}
fun main(){
    val user = User()
    user.login = "Вингельм"
    println(user.password)
    user.password = "54321"
}
