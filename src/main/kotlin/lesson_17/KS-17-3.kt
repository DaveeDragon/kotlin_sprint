package org.example.lesson_17

class Folder(
    val secretFlag: Boolean,
){
    val filesQuantity = 32
    val name: String = "Топ сикрет"
        get()  = if (secretFlag == true) "скрытая папка,количество файлов - 0"
        else " папка $field, количество файлов - $filesQuantity"
}
fun main(){
    val folder = Folder(true)
    println(folder.name)
}
