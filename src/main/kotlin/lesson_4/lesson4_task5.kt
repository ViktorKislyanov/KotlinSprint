package lesson_4

import java.util.*

const val CONDITION_IS_DAMAGED = false
const val CONDITION_PROVISION_BOXES = 50
const val CONDITION_IS_FAVORABLE = true
const val CONDITION_IS_UNFAVORABLE = true

const val CONDITION_DAMAGED_SHIP_CREW_SIZE = 70

fun main() {

    val scanner = Scanner(System.`in`)

    println("Корпус корабля поврежден? [true/false]")
    val isDamaged = scanner.nextBoolean()

    println("Размер экипажа? [число]")
    val crewSize = scanner.nextInt()
    val conditionCrewSize = crewSize in 55..70

    println("Количество ящиков с провизией? [число]")
    val provisionBoxesNum = scanner.nextInt()

    println("Погода благоприятная? [true/false]")
    val isFavorable = scanner.nextBoolean()

    if ((isDamaged == CONDITION_IS_DAMAGED) &&
        (conditionCrewSize) &&
        (provisionBoxesNum > CONDITION_PROVISION_BOXES) &&
        (isFavorable == CONDITION_IS_FAVORABLE || isFavorable == CONDITION_IS_UNFAVORABLE)
    ) {
        println("Success!! Корабль может отплыть! Удачного плавания!")
    } else if ((!isDamaged == CONDITION_IS_DAMAGED) &&
        (crewSize == CONDITION_DAMAGED_SHIP_CREW_SIZE) &&
        (provisionBoxesNum > CONDITION_PROVISION_BOXES) &&
        (isFavorable == CONDITION_IS_FAVORABLE || isFavorable == CONDITION_IS_UNFAVORABLE)
    ) {
        println("Success!! Корабль может отплыть! Удачного плавания!")
    } else {
        println("Fail!! Корабль не может отплыть! Подготовьтесь лучше!")
    }
}