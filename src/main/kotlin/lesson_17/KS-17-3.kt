package org.example.lesson_17

class Folder(
    val secretFlag: Boolean,
){
    val filesQuantity: Int = 32
        get()  = if (secretFlag == true) 0
        else field

    val name: String = "Топ сикрет"
        get()  = if (secretFlag == true)"скрытая папка"
        else "папка $field"
}
fun main(){
    val folder = Folder(true)
    println(folder.name)
    println(folder.filesQuantity)
    println()
    val folder1 = Folder(false)
    println(folder1.name)
    println(folder1.filesQuantity)
}
