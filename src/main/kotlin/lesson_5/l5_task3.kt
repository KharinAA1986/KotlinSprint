package org.example.lesson_5


fun main() {
    val firstRightAnswer = 10
    val secondRightAnswer = 20
    println("Введите первое число")
    val firstAnswer = readln().toInt()
    println("Введите второе число")
    val secondAnswer = readln().toInt()
    val minAnswer = minOf(firstAnswer, secondAnswer)
    val maxAnswer = maxOf(firstAnswer, secondAnswer)
    val minNumber = minOf(firstRightAnswer, secondRightAnswer)
    val maxNumber = maxOf(firstRightAnswer, secondRightAnswer)

    if (minAnswer != minNumber && maxAnswer != maxNumber && maxAnswer != minNumber && minAnswer != maxNumber) {
        println("Неудача!")
    } else if (minAnswer == minNumber && maxAnswer == maxNumber) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else println("Вы выиграли утешительный приз!")
    println("Правильные числа $firstRightAnswer и $secondRightAnswer")
}