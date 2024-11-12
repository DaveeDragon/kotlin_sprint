package org.example.lesson_20


fun main(){

    val SplashScreen: (String) -> Unit

    SplashScreen = {userName: String ->
        println("С наступающим Новым Годом, $userName!")
    }

    val userName = "Алеша"
    SplashScreen(userName)

}
