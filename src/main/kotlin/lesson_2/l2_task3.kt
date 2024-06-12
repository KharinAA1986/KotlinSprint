package org.example.lesson_2

const val MINUTES_IN_HOUR:Short = 60
const val HOURS_IN_DAY:Short = 24

fun main(){
    // т.к. сказано "– Создай целочисленные переменные и проинициализируй их этими данными;",
    // считаю, что числа уже преобразованы и мы получаем отдельно часы и минуты
    val hours: Short = 9
    val minutes: Short = 39
    val duration: Short = 457
    val startTimeInMinutes = hours * MINUTES_IN_HOUR + minutes
    val finishTimeInMinutes = startTimeInMinutes + duration
    val finishMinute = finishTimeInMinutes % MINUTES_IN_HOUR
    val finishHour = finishTimeInMinutes / MINUTES_IN_HOUR
    println((finishHour % HOURS_IN_DAY).toString() + ":" + finishMinute)
}
