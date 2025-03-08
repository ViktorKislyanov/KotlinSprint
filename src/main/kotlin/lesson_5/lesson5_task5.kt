package lesson_5

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    val lotteryWinNumbers = List(3) { Random.nextInt(0..42) }
    val lotteryPlayerNumbers = mutableListOf<Int>()

    repeat(3) {
        print("Угадайте число (от 0 до 42): ")
        lotteryPlayerNumbers.add(readln().toInt())
    }

    val matchingNumbers = lotteryPlayerNumbers.intersect(lotteryWinNumbers.toSet()).size

    when (matchingNumbers) {
        3 -> println(
            """
            J.A.C.K.P.O.T! Вы угадали все числа!
            Указанные числа: $lotteryPlayerNumbers
            Выигрышные числа: $lotteryWinNumbers
        """.trimIndent()
        )

        2 -> println(
            """
            Выигрыш! Вы угадали два числа из трёх!
            Указанные числа: $lotteryPlayerNumbers
            Выигрышные числа: $lotteryWinNumbers
        """.trimIndent()
        )

        1 -> println(
            """
            Вы выиграли утешительный приз! Вы угадали одно число из трех!
            Указанные числа: $lotteryPlayerNumbers
            Выигрышные числа: $lotteryWinNumbers
        """.trimIndent()
        )

        else -> println(
            """
            Неудача! Вы не угадали ни одного числа!
            Указанные числа: $lotteryPlayerNumbers
            Выигрышные числа: $lotteryWinNumbers
        """.trimIndent()
        )
    }
}
