package ru.tinkoff.lesson_12.filter

fun main() {
    val myFilteredList = listOf("Хрюша", "Степаша", "Филя", "Гуля").filter { it.length < 6 }

    for (elem in myFilteredList)
        println(elem)
}