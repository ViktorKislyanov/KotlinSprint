package lesson_3

fun main() {
    var startPosition = "E2"
    var newPosition = "E4"
    var whiteMoveNumber = 0

    println("Ход белых: [$startPosition-$newPosition; ${++whiteMoveNumber}]")

    startPosition = "D2"
    newPosition = "D3"

    println("Следующий ход белых: [$startPosition-$newPosition; ${++whiteMoveNumber}]")

    val playerLog = "D2-D4;0"

    val parsed = playerLog.split("-", ";")
    startPosition = parsed[0]
    newPosition = parsed[1]
    whiteMoveNumber = parsed[2].toInt()

    print("Parsed: $startPosition|$newPosition|$whiteMoveNumber")

}