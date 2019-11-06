package ru.tinkoff.lesson_12

fun main() {
    listOf("Хрюша", "Степаша", "Филя", "Гуля")
        .asSequence()
        .filter { it.length <= 4 }
        .forEach { println("Привет, ${it}") }
}

