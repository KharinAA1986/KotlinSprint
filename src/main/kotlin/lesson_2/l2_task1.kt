package org.example.lesson_2

fun main() {
    val rating1 = 3
    val rating2 = 4
    val rating3 = 3
    val rating4 = 5
    val quantity = 4
    val average = (rating1 + rating2 + rating3 + rating4).toFloat() / quantity
    println(String.format("%.2f", average))
}