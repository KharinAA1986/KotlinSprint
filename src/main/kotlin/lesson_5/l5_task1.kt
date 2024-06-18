package org.example.lesson_5

fun main() {
    val firstNumber = 5
    val secondNumber = 5
    println("Чтобы доказать, что вы не бот, решите простой пример: $firstNumber + $secondNumber = ?")
    val answer = readln().toInt()

    if (answer == firstNumber + secondNumber) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}