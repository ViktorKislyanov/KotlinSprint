package lesson_5

fun main() {

    val firstNumber = 77
    val secondNumber = 33
    val rightAnswer = 110

    println("Пользователь зашел на сайт")
    println("А вы точно не робот? Решите простой математический пример: $firstNumber + $secondNumber")

    val userAnswer = readln().toInt()

    if (userAnswer == rightAnswer) println("Ура, вы не робот! Добро пожаловать!")
    else println("Доступ ограничен")
}
