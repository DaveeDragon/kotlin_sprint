package org.example.lesson_22

class  MainScreenViewMode() {
    var state: MainScreenState = MainScreenState("")

    data class MainScreenState(
        val data: String,
        val isLoading: Boolean = false,
    ) {}


    fun loadData(){
        state = state.copy("отсутствие данных")
        println(state)
        println()

        val state2 = state.copy("загрузка данных",true)
        println(state2)
        println()

        val state3 = state.copy(" наличие загруженных данных")
        println(state3)
        println()
    }
}

fun main(){
    val mainScreen = MainScreenViewMode()
    mainScreen.loadData()
}
