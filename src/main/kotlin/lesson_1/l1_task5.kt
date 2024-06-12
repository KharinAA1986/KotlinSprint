package org.example.lesson_1

const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_MINUTE = 60

fun main() {
    val secondsInCosmos = 6480
    val hours: Int = secondsInCosmos / (MINUTES_IN_HOUR * SECONDS_IN_MINUTE)
    val secondsWithoutHours: Int = secondsInCosmos % (MINUTES_IN_HOUR * SECONDS_IN_MINUTE)
    val minutes: Int = secondsWithoutHours / SECONDS_IN_MINUTE
    val seconds: Int = secondsWithoutHours % SECONDS_IN_MINUTE
    println("${format(hours)}:${format(minutes)}:${format(seconds)}")
}

fun format(number: Int) = String.format("%02d", number)
