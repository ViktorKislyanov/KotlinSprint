package lesson_2

const val usualCrystals: Float = 7f
const val usualIron:Float = 11f

fun main() {

    val buffedCrystals = (usualCrystals * 0.2).toInt()
    println("кристаллы, которые дается “сверху” баффом: $buffedCrystals")

    val buffedIron = (usualIron * 0.2).toInt()
    println("железо, которое дается “сверху” баффом: $buffedIron")
}