package org.example.lesson_2

const val MINUTES_IN_HOUR: Short = 60
const val HOURS_IN_DAY: Short = 24

fun main() {
    val hours: Short = 9
    val minutes: Short = 39
    val duration: Short = 457
    val startTimeInMinutes = hours * MINUTES_IN_HOUR + minutes
    val finishTimeInMinutes = startTimeInMinutes + duration
    val finishMinute = finishTimeInMinutes % MINUTES_IN_HOUR
    val finishHour = finishTimeInMinutes / MINUTES_IN_HOUR
    println("${format(finishHour % HOURS_IN_DAY)}:${format(finishMinute)}")
}

fun format(number: Int) = String.format("%02d", number)
