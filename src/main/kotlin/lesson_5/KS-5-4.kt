package org.example.lesson_5

fun main(){

    val name = "Zaphod"
    val password = "PanGalactic"

    println("Что ж, введи, пожалуйста, свое имя пользователя и пароль, чтобы мы могли приступить к процессу входа")
    val name1 = readLine()
    val password2 = readLine()

    if ((name1 == name) and (password2 == password)) println("Ваши данные проверены, и о, чудо, они верны... Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.")
    else println("зарегистрируйтесь и продолжите процесс")
}


