package org.example.lesson_4

fun main() {
    val minStaff = 55
    val maxStaff = 70
    val foodBoxesMin = 50
    println("Есть ли повреждения?")
    val isDamage = readln().toBoolean()
    println("Количество членов экипажа?")
    val staff = readln().toInt()
    println("Количество ящиков с провизией?")
    val foodBoxes = readln().toInt()
    println("Погода благоприятна?")
    val isWeatherOk = readln().toBoolean()
    if ((foodBoxes > foodBoxesMin && !isDamage && staff >= minStaff && staff <= maxStaff) ||
        isDamage && staff == maxStaff && isWeatherOk && foodBoxes >= foodBoxesMin
    ) {
        println("Судно может выйти в плаванье")
    } else println("Судно не может выйти в плаванье")
}