package org.example.lesson_4

fun main() {
    val dayNumber = 5
    val dayLegsIsEven = true
    val dayBackIsEven = true
    val dayHandsIsEven = false
    val dayPressIsEven = false

    println(
        "Упражнения для рук:\t \t ${(dayNumber % 2 == 0) == dayHandsIsEven}\n" +
                "Упражнения для ног:\t \t ${(dayNumber % 2 == 0) == dayLegsIsEven}\n" +
                "Упражнения для спины:\t ${(dayNumber % 2 == 0) == dayBackIsEven}\n" +
                "Упражнения для пресса:\t ${(dayNumber % 2 == 0) == dayPressIsEven}"
    )
}