package org.example.lesson_4

fun main() {
    val dayNumber = 5
    val dayNumberIsEven = dayNumber % 2 == 0

    println(
        "Упражнения для рук:\t \t ${!dayNumberIsEven}\n" +
                "Упражнения для ног:\t \t $dayNumberIsEven\n" +
                "Упражнения для спины:\t $dayNumberIsEven\n" +
                "Упражнения для пресса:\t ${!dayNumberIsEven}"
    )
}