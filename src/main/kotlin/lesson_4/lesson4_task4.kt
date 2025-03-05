package lesson_4

fun main() {

    var dayCount = 5

    println("Упражнения для рук: ${(dayCount % 2 !== 0)} \n" +
            "Упражнения для ног: ${(dayCount % 2 == 0)} \n" +
            "Упражнения для спины: ${(dayCount % 2 == 0)} \n" +
            "Упражнения для пресса: ${(dayCount % 2 !== 0)} \n")

    dayCount++

    println("Упражнения для рук: ${(dayCount % 2 !== 0)} \n" +
            "Упражнения для ног: ${(dayCount % 2 == 0)} \n" +
            "Упражнения для спины: ${(dayCount % 2 == 0)} \n" +
            "Упражнения для пресса: ${(dayCount % 2 !== 0)} \n")
}