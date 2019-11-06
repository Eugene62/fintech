package ru.tinkoff.lesson_12.find_max

fun main() {
    val myGoodNightTeam = listOf("Хрюша", "Степаша", "Филя", "Гуля")

    val maxLength = myGoodNightTeam
        .asSequence()
        .map { it.length }
        .max()

    val nameWithMaxSize = myGoodNightTeam.find { it.length == maxLength }

    println(nameWithMaxSize)
}