package org.example.lesson_2

import kotlin.math.pow

fun main(){
    val sum = 70000
    val percent = 16.7
    val period = 20
    val result = sum * (1 + percent / 100).pow(period)
    println(String.format("%.3f",result))
}