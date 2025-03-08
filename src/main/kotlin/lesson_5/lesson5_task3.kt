package lesson_5

const val WINNER_FIRST_NUMBER = 17
const val WINNER_SECOND_NUMBER = 4

fun main() {

    print("Угадайте первое число (от 0 до 42): ")
    val firstNumber = readln().toInt()

    print("Угадайте второе число (от 0 до 42): ")
    val secondNumber = readln().toInt()

    val isFirstMatch = firstNumber == WINNER_FIRST_NUMBER || firstNumber == WINNER_SECOND_NUMBER
    val isSecondMatch = secondNumber == WINNER_FIRST_NUMBER || secondNumber == WINNER_SECOND_NUMBER

    when {
        isFirstMatch && isSecondMatch -> println("Поздравляем! Вы выиграли главный приз!")
        isFirstMatch || isSecondMatch -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }
}