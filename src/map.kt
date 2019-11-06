package ru.tinkoff.lesson_12.map

fun main() {
    val myFrendlyList = listOf("Хрюша", "Степаша", "Филя", "Гуля").map { it.let { "Привет, $it" } }

    for (elem in myFrendlyList)
        println(elem)
}