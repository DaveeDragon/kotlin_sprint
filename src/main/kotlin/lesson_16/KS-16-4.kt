package org.example.lesson_16

import kotlin.random.Random

class Order(){
    private val orderNumber = Random.nextInt(1000000,1999999)
    private var readyStatus = "заказ принят в обработку"

   private fun changeStatus(_newStatus: String){
        readyStatus = _newStatus
        println("Статус изменен - $readyStatus")
    }
    fun requestToManager(newStatus: String){
        changeStatus(newStatus)
    }
}

fun main(){
    val order = Order()
    order.requestToManager("товар отдан на доставку")
}
