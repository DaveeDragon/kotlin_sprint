package org.example.lesson_2

import kotlin.math.pow

fun main(){
    val contribution = 70000.000
    val contributionAfterTwentyYears = contribution*(1.167.pow(20))
    println(String.format("%.3f",contributionAfterTwentyYears))

}