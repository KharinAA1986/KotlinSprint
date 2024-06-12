package org.example.lesson_2

fun main(){
    val quantityRegular = 50
    val salaryRegular = 30000
    val quantityIntern = 30
    val salaryIntern = 20000
    val expensesRegular = quantityRegular * salaryRegular
    val expensesIntern = quantityIntern * salaryIntern
    val expensesTotal = expensesRegular + expensesIntern
    val averageSalary = expensesTotal / (quantityRegular + quantityIntern)
    println(expensesRegular)
    println(expensesTotal)
    println(averageSalary)
}