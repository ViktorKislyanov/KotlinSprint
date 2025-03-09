package lesson_5

fun main() {

    print("Введите расстояние поездки (в км.): ")
    val userDistance = readln().toFloat()

    print("Введите раcход топлива на 100км. (в литрах): ")
    val userFuelWaste = readln().toFloat()

    print("Введите цену за литр топлива (₽): ")
    val userFuelLiterCost = readln().toFloat()

    val neededFuel = (userDistance * userFuelWaste) / 100
    val fuelCost = neededFuel * userFuelLiterCost

    println(
        """
        Общее количество необходимого топлива: $neededFuel
        Итоговая стоимость поездки: ${String.format("%.2f", fuelCost)}₽
    """.trimIndent()
    )
}