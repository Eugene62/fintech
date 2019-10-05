package ru.tinkoff

import java.util.Scanner

class Car() {
    fun ride(km: Int) {
        var distanse = km
        println("поехали!")
        while ( distanse != 0 ) {
            println("Осталось $distanse километров")
            --distanse
        }
        println("Приехали!")
    }
}
val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val car = Car()
    println("Введите числ:")
    car.ride(scan.nextInt())
}