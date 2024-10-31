package org.example.lesson_18

class Order(
    val orderNumber: Long,
){
    fun orderShow(
        product: String,
    ){
        println("Заказан товар: $product")
    }

    fun orderShow(
        products: List<String>,
    ){
        println("Заказаны следующие товары: $products")

    }
}
fun main() {
    val order = Order(23131)
    order.orderShow("ботинки")

    val order1 = Order(21312)
    order1.orderShow(listOf("шапка", "пальто", "перчатки"))
}