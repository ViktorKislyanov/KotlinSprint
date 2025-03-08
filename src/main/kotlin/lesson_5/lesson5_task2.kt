package lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = 2025

    print("Введите свою дату рождения: ")
    val userBirthYear = readln().toInt()

    if ((currentYear - userBirthYear) >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Возвращение на главный экран")
}