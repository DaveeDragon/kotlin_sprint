package org.example.lesson_22


data class MainScreenStat(
    val data: String,
    val isLoading: Boolean = false,
) {}

class  MainScreenViewMode() {
    fun loadData(){
        var state = MainScreenStat("отсутствие данных")
        state = state.copy()
        println(state)
        println()
        Thread.sleep(1000)

        state = MainScreenStat("загрузка данных", true)
        state = state.copy()
        println(state)
        println()
        Thread.sleep(1000)

        state = MainScreenStat("наличие загруженных данных")
        state = state.copy()
        println(state)
    }
}

fun main(){
    val mainScreen = MainScreenViewMode()
    mainScreen.loadData()
}
