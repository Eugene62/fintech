package ru.tinkoff

import java.util.Scanner

val scanCats = Scanner(System.`in`)

open class AnotherCat() {
    open fun voice() {
        println("Meow meow meow!!!")
    }
}

class HomeCat( val ownerName: String ): AnotherCat()
{
    override fun voice() {
        println("Meoooooow! Feed me, $ownerName!")
    }
}

fun makeCatVoice(e: AnotherCat){
    e.voice()
}

fun main(args: Array<String>) {
    val usualCat = AnotherCat()        // Создаем обычного кота

    println("Введите имя:")
    val name = scanCats.next()      // Считываем имя
    val homeCat = HomeCat(name) // Передаём в конструктор

    println("Введите числ:")
    val num = scanCats.nextInt()

    repeat(num) {
        makeCatVoice(usualCat)
        makeCatVoice(homeCat)
    }
}