package lesson_2

fun main() {

    val serverReport = "поезд выехал в 9:39"
    val departureHours = 9
    val departureMinutes = 39

    val travelTimeInMinutes = 457
    val totalMinutes = travelTimeInMinutes + departureMinutes

    val arrivalHours = departureHours + (totalMinutes / 60)
    val arrivalMinutes = totalMinutes % 60

    println("Поезд прибудет к $arrivalHours:$arrivalMinutes")
}