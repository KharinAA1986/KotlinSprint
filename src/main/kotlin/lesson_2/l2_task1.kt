package org.example.lesson_2

fun main(){
    val rating1 = 3
    val rating2 = 4
    val rating3 = 3
    val rating4 = 5
    val quantity = 4
    val method1 = (rating1 + rating2 + rating3 +rating4) * 100 / quantity
    println(method1/100.0)
//    val method2 = ((rating1 + rating2 + rating3 +rating4) / quantity.toFloat())
//    println(String.format("%.2f", method2))
}