package org.example.lesson_22


data class MainScreenStat(
    val data: String,
    val isLoading: Boolean = false,
) {}

class  MainScreenViewMode() {
    fun loadData(){
        var stat = MainScreenStat("отсутствие данных")
        println(stat)
        println()
        Thread.sleep(1000)

        stat = MainScreenStat("загрузка данных", true)
        println(stat)
        println()
        Thread.sleep(1000)

        stat = MainScreenStat("наличие загруженных данных")
        println(stat)
    }
}

fun main(){
    val mainScreen = MainScreenViewMode()
    mainScreen.loadData()


}
