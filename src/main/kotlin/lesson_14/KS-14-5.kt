package org.example.lesson_14

open class Chat(
    val messageList: MutableList<Message> = mutableListOf(),
    val childMessageList: MutableList<ChildMessage> = mutableListOf(),
){
    fun addMessage( name: String, message: String){
    }

    fun addThreadMessage(name: String?, message: String?, parentMessageId: String? = null) {
    }

    fun printChat(){
        if()
    }

}
open class Message(
    val id: Int,
    val message: String,
    val name: String,
){}

class ChildMessage(
     id: Int,
     message: String,
     name: String,
): Message(id, message, name){}
