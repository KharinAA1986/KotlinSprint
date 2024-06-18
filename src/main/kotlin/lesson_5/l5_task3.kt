package org.example.lesson_5

fun main() {
    val firstRightAnswer = 10
    val secondRightAnswer = 20
    println("Введите первое число")
    val firstAnswer = readln().toInt()
    println("Введите второе число")
    val secondAnswer = readln().toInt()

    if (firstAnswer != firstRightAnswer && firstAnswer != secondRightAnswer
        && secondAnswer != secondRightAnswer && secondAnswer != firstRightAnswer
    ) {
        println("Неудача!")
    } else if ((firstAnswer == firstRightAnswer && secondAnswer == secondRightAnswer)
        || (firstAnswer == secondRightAnswer && secondAnswer == firstRightAnswer)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else println("Вы выиграли утешительный приз!")
    println("Правильные числа $firstRightAnswer и $secondRightAnswer")
}