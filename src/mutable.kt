package ru.tinkoff.lesson_8

fun main() {
    val myArrayList: List<String> = listOf("Крош", "Ёжик", "Нюша", "Бараш")

    var myMutArrayList = arrayListOf<String>()

    for (elem in myArrayList)
        myMutArrayList.add(elem + " array")

    println("Переписал")

    for (elem in myMutArrayList)
        println(elem)

    val myHashSet: HashSet<String> = hashSetOf("Крош", "Ёжик", "Нюша", "Бараш")

    var myMutHashSet: HashSet<String> = hashSetOf<String>()

    for (elem in myHashSet)
        myMutHashSet.add(elem + " hashSet")

    println("Переписал")

    for (elem in myMutHashSet)
        println(elem)
}