package lesson_4

const val AVERAGE_MIN_KG = 35
const val AVERAGE_MAX_KG = 100
const val AVERAGE_MAX_LITERS = 100

fun main() {

    var cargoKg = 20
    var cargoLiters = 80

    println("Груз с весом $cargoKg кг и объемом $cargoLiters л" +
            "соответствует категории 'Average': " +
            "${((cargoKg > AVERAGE_MIN_KG) && (cargoLiters <= AVERAGE_MAX_KG)) &&
                    (cargoLiters < AVERAGE_MAX_LITERS)}")

    cargoKg = 50
    cargoLiters = 100
    println("Груз с весом $cargoKg кг и объемом $cargoLiters л" +
            "соответствует категории 'Average': " +
            "${((cargoKg > AVERAGE_MIN_KG) && (cargoLiters <= AVERAGE_MAX_KG)) &&
                    (cargoLiters < AVERAGE_MAX_LITERS)}")
}