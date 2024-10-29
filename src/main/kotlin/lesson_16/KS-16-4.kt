package org.example.lesson_16

import kotlin.random.Random

class Order(){
    private val orderNumber = Random.nextInt(1000000,1999999)
    private var readyStatus = "заказ принят в обработку"

    fun changeStatus(newStatus: String){
        readyStatus = newStatus
        println("Статус изменен - ${readyStatus}")
    }
}

fun main(){
    val order = Order()
    order.changeStatus("товар отдан на доставку")
}
