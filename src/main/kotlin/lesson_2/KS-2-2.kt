package org.example.lesson_2

fun main(){
    val workersNumber = 50
    val workersSalary = 30000
    val internsNumber = 30
    val internsSalary = 20
    val salariesOfPermanentWorkers = workersSalary * workersNumber
    val salariesOfInterns = internsSalary * internsNumber
    val generalExpenaes = salariesOfPermanentWorkers + salariesOfInterns
    val averageSalary = generalExpenaes / (internsNumber + workersNumber)

    println(salariesOfPermanentWorkers)
    println(generalExpenaes)
    println(averageSalary)


}