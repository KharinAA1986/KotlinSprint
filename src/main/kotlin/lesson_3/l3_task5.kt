package org.example.lesson_3

fun main() {
    val move = "D2-D4;0"
    val parts = move.split('-', ';')
    val start = parts[0]
    val finish = parts[1]
    val number = parts[2]
    println(start)
    println(finish)
    println(number)
}

