package lesson_4

const val RESTAURANT_TABLES = 13

fun main() {

    val todayBooked = 13
    val tomorrowBooked = 9

    println("[Доступность столиков на сегодня: ${RESTAURANT_TABLES > todayBooked}]")
    println("[Доступность столиков на сегодня: ${RESTAURANT_TABLES > tomorrowBooked}]")
}