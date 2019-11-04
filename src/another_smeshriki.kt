package ru.tinkoff

fun main() {
    val myArrayList: ArrayList<String> = arrayListOf("Крош", "Ёжик", "Нюша", "Бараш")

    for (elem in myArrayList)
        println(elem)

    val myHashSet: HashSet<String> = hashSetOf("Крош", "Ёжик", "Нюша", "Бараш")

    for (elem in myHashSet)
        println(elem)
}