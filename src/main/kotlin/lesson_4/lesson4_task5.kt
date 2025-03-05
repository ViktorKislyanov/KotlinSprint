package lesson_4

import java.util.Scanner

const val CONDITION_IS_DAMAGED = false
const val CONDITION_PROVISION_BOXES = 50
const val CONDITION_FAVORABLE_WEATHER = true
const val CONDITION_UNFAVORABLE_WEATHER = true

const val CONDITION_DAMAGED_SHIP_CREW_SIZE = 70

fun main() {
//- наличие повреждений корпуса (Boolean переменная);
//- текущий состав экипажа;
//- количество ящиков с провизией на борту;
//- благоприятность метеоусловий (Boolean переменная).
    val scanner = Scanner(System.`in`)

    println("Корпус корабля поврежден? [true/false]")
    val isDamaged = scanner.nextBoolean()

    println("Размер экипажа? [число]")
    val crewSize = scanner.nextInt()
    val conditionCrewSize = crewSize in 55..70

    println("Количество ящиков с провизией? [число]")
    val provisionBoxesNum = scanner.nextInt()

    println("Погода благоприятная? [true/false]")
    val favorableWeather = scanner.nextBoolean()

    if ((isDamaged == CONDITION_IS_DAMAGED) &&
        (conditionCrewSize) &&
        (provisionBoxesNum > CONDITION_PROVISION_BOXES) &&
        (favorableWeather == CONDITION_FAVORABLE_WEATHER || favorableWeather == CONDITION_UNFAVORABLE_WEATHER)
    ) {
        println("Корабль может отплыть! Удачного плавания!")
    } else if ((!isDamaged == CONDITION_IS_DAMAGED) &&
        (crewSize == CONDITION_DAMAGED_SHIP_CREW_SIZE) &&
        (favorableWeather == CONDITION_FAVORABLE_WEATHER ||
                favorableWeather == CONDITION_UNFAVORABLE_WEATHER) &&
        (provisionBoxesNum > CONDITION_PROVISION_BOXES)
    ) {
        println("Корабль может отплыть! Удачного плавания!")
    } else {
        println("Корабль не может отплыть! Подготовьтесь лучше!")
    }
}