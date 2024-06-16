package org.example.lesson_5

fun main() {
    println("Чтобы доказать, что вы не бот, решите простой пример: 5 + 5 = ?")
    val answer = readln().toInt()
    if (answer == 10) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}