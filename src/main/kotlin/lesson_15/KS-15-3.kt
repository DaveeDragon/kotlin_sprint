package org.example.lesson_15

abstract class Users(
    val userName: String,
){
    fun readForum(){
        println("*огромный чат где обсуждали тему вопроса*")
    }

    fun addMessage(){
        println("ползьователь $userName оставил сообщение на форуме")
    }
}

open class RegularUsers( userName: String): Users(userName)

open class Admin(userName: String): Users(userName){
    fun deleteUser(deleteUser: String){
        println("админ $userName удалил ползователя $deleteUser")
    }
    fun deleteMessage(){
        println("админ $userName удалили сообщение")
    }
}

fun main(){
    val user1 = RegularUsers("Артур")
    val user2 = RegularUsers("Денис")
    val user3 = RegularUsers("Рональд")

    val admin1 = Admin("Важнич")
    user1.addMessage()
    user2.addMessage()
    user3.readForum()

    admin1.deleteMessage()
    admin1.deleteUser("Рональд")
}