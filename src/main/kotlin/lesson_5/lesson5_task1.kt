package lesson_5

import java.util.*

fun main() {

    val firstNumber = 77
    val secondNumber = 33
    val rightAnswer = 110

    println("Пользователь зашел на сайт")
    println("А вы точно не робот? " + "Решите простой математический пример: $firstNumber + $secondNumber")

    val scanner = Scanner(System.`in`)
    val userAnswer = scanner.nextInt()

    if (userAnswer == rightAnswer) println("Ура, вы не робот! Добро пожаловать!")
    else println("Доступ ограничен")
}
