package org.example.lesson_1

val secondsInCosmos = 6480
const val minutesInHour = 60
const val secondsInMinute = 60

fun main(){
    val hours:Int = secondsInCosmos / (minutesInHour * secondsInMinute)
    val secondsWithoutHours:Int = secondsInCosmos % (minutesInHour * secondsInMinute)
    val minutes:Int = secondsWithoutHours / secondsInMinute
    val seconds:Int = secondsWithoutHours % secondsInMinute
    println(formatToTime(hours) + ":" + formatToTime(minutes) + ":" + formatToTime(seconds))
}

fun formatToTime(number:Int): String = if(number<10) "0$number" else number.toString()