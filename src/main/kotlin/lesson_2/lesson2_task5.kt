package lesson_2

import kotlin.math.pow

fun main() {
    val userDeposit = 70_000
    val interestRate = 16.7
    val years = 20

    //S = P * (1 + i) ** n
    val result = String.format("%.3f", userDeposit *(1 + (interestRate / 100)).pow(years))
    println(result)
}