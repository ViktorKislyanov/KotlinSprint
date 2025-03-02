package lesson_1

fun main() {
    val secondsInSpace = 6480
    val secondsInHour = 3600
    val minutesInHour = 60

    val hours = secondsInSpace / secondsInHour
    val minutes = (secondsInSpace % secondsInHour) / minutesInHour
    val seconds = secondsInSpace % minutesInHour

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(formattedTime)
}
