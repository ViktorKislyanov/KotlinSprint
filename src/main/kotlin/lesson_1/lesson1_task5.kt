package lesson_1

fun main() {
    val secondsInSpace = 6480

    val hours = secondsInSpace / 3600                   //1
    val minutes = (secondsInSpace % 3600) / 60          //  2880 / 60
    val seconds = secondsInSpace % 60                   //0

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(formattedTime)
}
