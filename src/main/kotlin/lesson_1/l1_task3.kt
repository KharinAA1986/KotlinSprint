package org.example.lesson_1

fun main() {
    val year = 1961
    var hour = 9
    var minute = 7
    println(year)
    println(formatToTime(hour))
    println(formatToTime(minute))
    hour = 10
    minute = 55
 //   println(formatToTime(hour) + ":" + formatToTime(minute))
    print(formatToTime(hour))
    print(":")
    print(formatToTime(minute))
}

fun formatToTime(number:Int): String = if(number<10) {
        "0$number"
    } else {
        number.toString()
    }



