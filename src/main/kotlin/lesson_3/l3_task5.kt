package org.example.lesson_3

fun main() {
    val move = "D2-D4;0"
    val parts = move.split(';')
    val number = parts[1]
    val fields = parts[0].split('-')
    val start = fields[0]
    val finish = fields[1]
    println(start)
    println(finish)
    println(number)
}