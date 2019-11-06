package ru.tinkoff.lesson_12

fun main() {
     var myMutableList = mutableListOf("Хрюша", "Степаша", "Филя", "Гуля")

    myMutableList.asSequence().filter { it.length <= 4 }
    
}

