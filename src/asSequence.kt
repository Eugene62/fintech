package ru.tinkoff.lesson_12

fun main() {
    var myGoodNightTeam = mutableListOf("Хрюша", "Степаша", "Филя", "Гуля")

    val myNeighborlyGoodNightTeam = myGoodNightTeam
        .asSequence()
        .filter { it.length <= 4 }
        .map { it.let { "Привет, $it" } }

    for (elem in myNeighborlyGoodNightTeam)
        println(elem)

}

