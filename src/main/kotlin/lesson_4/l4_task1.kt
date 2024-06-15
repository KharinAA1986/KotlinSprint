package org.example.lesson_4

fun main() {
    val tables = 13
    val freeTablesToday = 0
    val freeTablesTomorrow = 4
    val reservedToday = tables - freeTablesToday
    val reservedTomorrow = tables - freeTablesTomorrow
    println(
        "Доступность столиков на сегодня: ${reservedToday < tables}\n" +
                "Доступность столиков на завтра: ${reservedTomorrow < tables}"
    )
}