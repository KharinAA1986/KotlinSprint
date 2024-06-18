package org.example.lesson_4

fun main() {
    val dayNumber = 5
    val dayLegsIsEven = true
    val dayBackIsEven = true
    val dayHandsIsEven = false
    val dayPressIsEven = false
    val dayNumberIsEven = dayNumber % 2 == 0

    println(
        "Упражнения для рук:\t \t ${dayNumberIsEven == dayHandsIsEven}\n" +
                "Упражнения для ног:\t \t ${dayNumberIsEven == dayLegsIsEven}\n" +
                "Упражнения для спины:\t ${dayNumberIsEven == dayBackIsEven}\n" +
                "Упражнения для пресса:\t ${dayNumberIsEven == dayPressIsEven}"
    )
}