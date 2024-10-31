package org.example.lesson_18

open class Package(){
    open fun calculatePackaging() = ""
}

class RectangularPackage(
    val length: Int,
    val heigth: Int,
    val width: Int,
): Package(){
    val squire = 2 * (length * heigth + heigth * width + length * width)
   override fun calculatePackaging(): String {
       return squire.toString()
   }
}
class CubePackage(
    val edge: Int
): Package(){
    val squire = 6 * edge * edge
    override fun calculatePackaging(): String {
        return squire.toString()
    }
}
fun listPackage(list: List<Package>){
    list.forEach{
        println("Площадь упаковки для посылки - ${it.calculatePackaging()}")
    }
}

fun main(){
    val package1 = RectangularPackage(5,6,8)
    val package2 = CubePackage(7)
    val listPackage = listOf<Package>( package1, package2)
    listPackage(listPackage)
}
