package org.example.lesson_19

 enum class ProductCategories(val id: Int) {
     CLOTHES(1),
     OFFICE_SUPPLIES(2),
     OTHER(3)
     };
    fun ShowCategories(Category: ProductCategories){
        when(Category){
            ProductCategories.CLOTHES -> println("Категория товара - Одежда")
            ProductCategories.OFFICE_SUPPLIES -> println("Категория товара - Канцелярские товары")
            ProductCategories.OTHER -> println("Категория товара - Разное")
        }

}

class Products(
    val name: String,
    val id: Int,
    val category: ProductCategories,
){
    fun productsInfoShow(){
        println("Названием товара - $name")
        when(id) {
            ProductCategories.CLOTHES.id -> ShowCategories(ProductCategories.CLOTHES)
            ProductCategories.OFFICE_SUPPLIES.id -> ShowCategories(ProductCategories.OFFICE_SUPPLIES)
            ProductCategories.OTHER.id -> ShowCategories(ProductCategories.OTHER)
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
