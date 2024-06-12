package org.example.lesson_3

fun main() {
    val userName = "Иван"
    val daytimePhrase = "Добрый день"
    val eveningPhrase = "Добрый вечер"
    var greetings = "$daytimePhrase, $userName!"
    println(greetings)
    greetings = "$eveningPhrase, $userName!"
    println(greetings)
}