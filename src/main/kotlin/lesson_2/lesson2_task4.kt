package lesson_2


fun main() {

    val usualCrystals = 7f
    val usualIron = 11f
    val buffPercents = 20f

    val buffedCrystals = (usualCrystals * (buffPercents / 100)).toInt()
    println("кристаллы, которые дается “сверху” баффом: $buffedCrystals")

    val buffedIron = (usualIron * (buffPercents/ 100)).toInt()
    println("железо, которое дается “сверху” баффом: $buffedIron")
}