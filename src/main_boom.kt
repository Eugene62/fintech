package ru.tinkoff

fun main() {
    listOf("three", "two", "one").forEach goto@{
        if (it == "one") {
            return@goto
        }
        println(it)
    }
    println("boom!")
}
