package org.example.lesson_4

fun main() {
    val isSunRequired = true
    val isOpenRequired = true
    val humidityPercentRequired = 20
    val seasonBanned = "зима"

    val isSun = true
    val isOpen = true
    val humidityPercent = 20
    val season = "зима"
    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (isSun == isSunRequired)
                    && (isOpen == isOpenRequired)
                    && (humidityPercent == humidityPercentRequired)
                    && (season != seasonBanned)
        }"
    )
}