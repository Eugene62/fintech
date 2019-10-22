package ru.tinkoff

import kotlinx.coroutines.*
import java.lang.Thread.sleep

fun main() {
    var dog = Pet("Goofy", 2000)
    var cat = Pet("Tomas", 5000)
    var bird = Pet("Snuffy", 1500)
    var fish = Pet("Nemo", 1000)
    var rabbit = Pet("Bugs", 3500)

    runBlocking {
        val dogIsFeed = async {
            dog.eat()
        }
        val catIsFeed = async {
            cat.eat()
        }
        val birdIsFeed = async {
            bird.eat()
        }
        val fishIsFeed = async {
            fish.eat()
        }
        val rabbitIsFeed = async {
            rabbit.eat()
        }

        if (dogIsFeed.await() && catIsFeed.await() && birdIsFeed.await() && fishIsFeed.await() && rabbitIsFeed.await())
            println("Животные покормлены")
    }

    sleep(6000)

}