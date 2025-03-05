package lesson_3

fun main() {

    var startPosition = "E2"
    var newPosition = "E4"
    var whiteMoveNumber = 0

    println("Ход белых: [$startPosition-$newPosition; ${++whiteMoveNumber}]")

    startPosition = "D2"
    newPosition = "D3"
    print("Следующий ход белых: [$startPosition-$newPosition; ${++whiteMoveNumber}]")
}