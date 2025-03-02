package lesson_2

fun main() {

    val grades = floatArrayOf(3f, 4f, 3f, 5f)

    val averageGrade: Float = (grades.sum() / grades.size)

    println(averageGrade)
}