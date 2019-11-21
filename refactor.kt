package ru.tinkoff.lesson_15

fun main() {
    val badExample = listOf("Хрюша", "Степаша", "Филя", "Гуля").filter{it.length > 6}[0]
    println("Было: $badExample")

    val goodExample = listOf("Хрюша", "Степаша", "Филя", "Гуля").first{it.length > 6}
    println("Стало: $badExample")

    //Незнание API не освобождает от ответственности
}