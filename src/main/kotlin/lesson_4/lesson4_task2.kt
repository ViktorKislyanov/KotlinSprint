package lesson_4

fun main() {

    val averageMinKg = 35
    val averageMaxKg = 100
    val averageMaxLiters = 100

    val cargo1Kg = 20

    val cargo2Kg = 50
    val cargo2Liters = 80

    val cargo3Liters = 100

    var comparisonResult: Boolean = (cargo1Kg > averageMinKg) && (cargo1Kg <= averageMaxKg)
    println("Груз с весом $cargo1Kg кг соотвествует категории 'Average': $comparisonResult")

    comparisonResult = ((cargo2Kg > averageMinKg) && (cargo2Kg <= averageMaxKg)) && (cargo2Liters < averageMaxLiters)
    println("Груз с весом $cargo2Kg кг и объемом $cargo2Liters л соотвествует категории 'Average': $comparisonResult")

    comparisonResult = (cargo3Liters < averageMaxLiters)
    println("Груз с объемом $cargo3Liters л соотвествует категории 'Average': $comparisonResult")
}