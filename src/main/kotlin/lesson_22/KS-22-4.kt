package org.example.lesson_22


data class MainScreenStat(
    val data: String,
    val isLoading: Boolean = false,
) {}

class  MainScreenViewMode() {
    fun loadData(){
        var state = MainScreenStat("отсутствие данных")
        val state1 = state.copy()

        state = MainScreenStat("загрузка данных", true)
        val state2 = state.copy()

        state = MainScreenStat("наличие загруженных данных")
        val state3 = state.copy()

        println(state1)
        println()
        Thread.sleep(1000)
        println(state2)
        println()
        Thread.sleep(1000)
        println(state3)
        println()
    }
}

fun main(){
    val mainScreen = MainScreenViewMode()
    mainScreen.loadData()


}
