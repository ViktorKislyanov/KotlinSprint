package lesson_4

const val CONDITION_IS_SUNNY = true
const val CONDITION_IS_AWNING_OPENED = true
const val CONDITION_AIR_HUMIDITY = 20
const val CONDITION_WRONG_SEASON = "Зима"

fun main() {

    val todayWeatherIsSunny = true
    val todayIsAwningOpened = true
    val todayAirHumidity = 20
    val currentSeason = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
                    "${((CONDITION_IS_SUNNY == todayWeatherIsSunny) 
                    && (CONDITION_IS_AWNING_OPENED == todayIsAwningOpened)
                    && (CONDITION_AIR_HUMIDITY == todayAirHumidity)
                    && (CONDITION_WRONG_SEASON !== currentSeason))}")
}