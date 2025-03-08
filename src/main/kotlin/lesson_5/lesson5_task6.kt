package lesson_5

import kotlin.math.pow

const val BMI_UNDERWEIGHT = 18.5
const val BMI_HEALTHY_WEIGHT = 25
const val BMI_OVERWEIGHT = 30

fun main() {

    print("Введите ваш вес (в кг.): ")
    val userWeight = readln().toFloat()

    print("Теперь введите ваш рост (в см.): ")
    val userHeightCm = readln().toFloat()
    val userHeightMetres = userHeightCm / 100

    val bodyMassIndex = userWeight / ((userHeightMetres).pow(2))

    when {
        (bodyMassIndex < BMI_UNDERWEIGHT) -> println(
            """
            Ваш ИМТ: ${String.format("%.2f", bodyMassIndex)}
            У вас недостаточная масса тела
        """.trimIndent()
        )

        (BMI_UNDERWEIGHT <= bodyMassIndex) && (bodyMassIndex < BMI_HEALTHY_WEIGHT) -> println(
            """
            Ваш ИМТ: ${String.format("%.2f", bodyMassIndex)}
            У вас нормальная масса тела
        """.trimIndent()
        )

        (BMI_HEALTHY_WEIGHT <= bodyMassIndex) && (bodyMassIndex < BMI_OVERWEIGHT) -> println(
            """
            Ваш ИМТ: ${String.format("%.2f", bodyMassIndex)}
            У вас избыточная масса тела
        """.trimIndent()
        )

        (bodyMassIndex > BMI_OVERWEIGHT) -> println(
            """
            Ваш ИМТ: ${String.format("%.2f", bodyMassIndex)}
            У вас ожирение
        """.trimIndent()
        )
    }
}