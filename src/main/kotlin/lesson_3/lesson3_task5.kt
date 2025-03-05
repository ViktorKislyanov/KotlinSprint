package lesson_3

fun main() {
    var startPosition = "E2"
    var newPosition = "E4"
    var whiteMoveNumber = 0

    println("Ход белых: [$startPosition-$newPosition; ${++whiteMoveNumber}]")

    startPosition = "D2"
    newPosition = "D3"

    println("Следующий ход белых: [$startPosition-$newPosition; ${++whiteMoveNumber}]")
    println()

    val playerLog = "D2-D4;0"

    val parsed = playerLog.split("-", ";")

    val parsedStartPosition = parsed[0]
    val parsedNewPosition = parsed[1]
    val parsedMoveNumber = parsed[2].toInt()


    val parsedString = """
        Стартовая позиция: $parsedStartPosition
        Новая позиция: $parsedNewPosition
        Номер хода: $parsedMoveNumber
    """.trimIndent()

    print(parsedString)
}