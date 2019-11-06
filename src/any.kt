package ru.tinkoff.lesson_12.any

fun main() {
    val isBigger: (Int) -> Boolean = { it == 7 }
    println( listOf("Хрюша", "Степаша", "Филя", "Гуля").any { isBigger(it.length) } )
}