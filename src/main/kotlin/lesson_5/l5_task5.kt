package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val listUserAnswers = mutableListOf<Int>()
    println("Введите первое число")
    listUserAnswers.add(readln().toInt())
    println("Введите второе число")
    listUserAnswers.add(readln().toInt())
    println("Введите третье число")
    listUserAnswers.add(readln().toInt())
    val listRightAnswers = List(3) { Random.nextInt(0, 42) }
    val rightAnswers = (listRightAnswers.intersect(listUserAnswers)).size
    when (rightAnswers) {
        0 -> println("Вы ничего не угадали")
        1 -> println("Вы угадали одно число, Вам будет выплачен утешительный приз")
        2 -> println("Вы угадали два числа, Вам будет выплачен крупный приз")
        3 -> println("Вы угадали три числа, Вы выиграли джекпот!")
    }
    println("Правильные ответы: ${listRightAnswers[0]}, ${listRightAnswers[1]} , ${listRightAnswers[2]}")
}