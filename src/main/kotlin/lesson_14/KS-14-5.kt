package org.example.lesson_14

class Chat(
    val messageList: MutableList<Message> = mutableListOf(),
    val childMessageList: MutableList<ChildMessage> = mutableListOf(),
){
    fun addMessage( userMessage: String, userName: String){
        val newMessage = Message(
            id = messageList.size,
            message = userMessage,
            name = userName,
        )
        messageList.add(newMessage)
    }
    fun addThreadMessage(userMessage: String, userName: String, userParentMessageId: Int) {
        val threadMessage = ChildMessage(
            id = messageList.size,
            message = userMessage,
            name = userName,
            parentMessageId = userParentMessageId,
        )
        childMessageList.add(threadMessage)
    }

    fun printChat(){
        val groupedChildMessage: Map<Int, List<ChildMessage>> = childMessageList.groupBy { it.parentMessageId }
        messageList.forEach{baseMessage->
        println("${baseMessage.name}: ${baseMessage.message}")
            groupedChildMessage[baseMessage.id]?.forEach{childMessage ->
                println("\t${childMessage.name}: ${childMessage.message}")
                    }
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
    val parentMessageId: Int,
): Message(id, message, name)
}

fun main() {
    val chat = Chat()
    chat.addMessage("привет ребята будете в доту играть?", "Артур",)
    chat.addThreadMessage("неет, у меня сегодня много домашки", "Данила кучерявый", chat.messageList[0].id)
    chat.addThreadMessage("го к семи освобожусь", "рыжий подбитый жизей", chat.messageList[0].id)
    chat.addThreadMessage("ребята задрали играть у завтра конрольная", "славик числавик", chat.messageList[0].id)
    chat.addMessage("ребят ну вы чо?..раз живем чего же", "Артур")
    chat.addMessage("вово", "вова волк")
    chat.addThreadMessage("дегенераты", "славик числавик", chat.messageList[1].id)
    chat.printChat()
}


