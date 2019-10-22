package ru.tinkoff

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Thread.sleep

fun main() {
    var dog = Pet("Goofy", 2000)
    var cat = Pet("Tomas", 5000)
    var bird = Pet("Snuffy", 1500)
    var fish = Pet("Nemo", 1000)
    var rabbit = Pet("Bugs", 3500)

    GlobalScope.launch {
        dog.eat()
    }
    GlobalScope.launch {
        cat.eat()
    }
    GlobalScope.launch {
        bird.eat()
    }
    GlobalScope.launch {
        fish.eat()
    }
    GlobalScope.launch {
        rabbit.eat()
    }

    sleep(6000)
    println("Животные покормлены")
}