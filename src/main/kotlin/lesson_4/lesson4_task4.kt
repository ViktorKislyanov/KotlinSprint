package lesson_4

fun main() {

    var dayCount = 5
    var isEven = dayCount % 2 == 0

    println(
        "Упражнения для рук: ${!isEven} \n" +
                "Упражнения для ног: $isEven \n" +
                "Упражнения для спины: $isEven \n" +
                "Упражнения для пресса: ${!isEven} \n"
    )

    dayCount++
    isEven = dayCount % 2 == 0

    println(
        "Упражнения для рук: ${!isEven} \n" +
                "Упражнения для ног: $isEven \n" +
                "Упражнения для спины: $isEven \n" +
                "Упражнения для пресса: ${!isEven} \n"
    )
}