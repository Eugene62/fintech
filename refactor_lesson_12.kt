package ru.tinkoff.lesson_15

fun main(){
    //val myGoodNightTeam = listOf("Хрюша", "Степаша", "Филя", "Гуля")

    //val maxLength = myGoodNightTeam
    //    .asSequence()
    //    .map { it.length }
    //    .max()

    //val nameWithMaxSize = myGoodNightTeam.find { it.length == maxLength }

    //println(nameWithMaxSize)

    //after refactor

    val myGoodNightTeam = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    val nameWithMaxSize = myGoodNightTeam.maxBy{it.length}

    println("$nameWithMaxSize")
}