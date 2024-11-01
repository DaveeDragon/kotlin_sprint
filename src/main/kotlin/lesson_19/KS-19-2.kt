package org.example.lesson_19

 enum class ProductCategories(val id: Int) {
     CLOTHES(1) {
         override fun ShowCategories(): String {
             return "Категория товара - Одежда"
         }
     },
     OFFICE_SUPPLIES(2) {
         override fun ShowCategories(): String {
             return "Категория товара - Канцелярские товары"
         }
     },
     OTHER(3) {
         override fun ShowCategories(): String {
             return "Категория товара - Разное"
         }
     };

    abstract fun ShowCategories(): String

}

class Products(
    val name: String,
    val id: Int,
    val category: ProductCategories,
){
    fun productsInfoShow(){
        println("Названием товара - $name")
        when(id) {
            ProductCategories.CLOTHES.id -> println( ProductCategories.CLOTHES.ShowCategories())
            ProductCategories.OFFICE_SUPPLIES.id -> println(ProductCategories.OFFICE_SUPPLIES.ShowCategories())
            ProductCategories.OTHER.id -> println(ProductCategories.OTHER.ShowCategories())
        }

    }
}
fun main(){
    val product1 = Products("пальто", 1, ProductCategories.CLOTHES)
    val product2 = Products("кроссовки", 3, ProductCategories.OTHER)

    product1.productsInfoShow()
    println()
    product2.productsInfoShow()

}
