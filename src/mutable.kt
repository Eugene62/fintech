package ru.tinkoff

fun main() {
    val myArrayList: List<String> = listOf("Крош", "Ёжик", "Нюша", "Бараш")

    var myMutarrayList: ArrayList<String> = mutableListOf<String>() as ArrayList<String>

    for (elem in myArrayList)
        myMutarrayList.add(elem + " array")

    println("Переписал")

    for (elem in myMutarrayList)
        println(elem)

    val myHashSet: HashSet<String> = hashSetOf("Крош", "Ёжик", "Нюша", "Бараш")

    var myMutHashSet: HashSet<String> = mutableSetOf<String>() as HashSet<String>

    for (elem in myHashSet)
        myMutHashSet.add(elem + " hashSet")

    println("Переписал")

    for (elem in myMutHashSet)
        println(elem)
}

