package org.example.lesson_2

import kotlin.math.pow

fun main(){
    val interestRate = 0.167
    val years = 20
    val contribution = 70000.0
    val contributionAfterTwentyYears = contribution * ((1 + interestRate).pow(years))
    println(String.format("%.3f",contributionAfterTwentyYears))

}