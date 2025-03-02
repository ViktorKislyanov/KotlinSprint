package lesson_2

const val minutesInHour = 60

fun main() {

    val serverReport = "Поезд выехал в 9:39"
    val departureHours = 9
    val departureMinutes = 39

    val travelTimeInMinutes = 457
    val totalMinutes = travelTimeInMinutes + departureMinutes

    val arrivalHours = departureHours + (totalMinutes / minutesInHour)
    val arrivalMinutes = totalMinutes % minutesInHour

    println(serverReport)
    print("Поезд прибудет к $arrivalHours:$arrivalMinutes")
}