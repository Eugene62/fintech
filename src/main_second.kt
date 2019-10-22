package ru.tinkoff

import com.sun.org.apache.xpath.internal.operations.Bool
import kotlinx.coroutines.*
import java.lang.Thread.sleep

fun main() {

    var dog = Pet("Goofy", 6000)
    var cat = Pet("Tomas", 15000)
    var bird = Pet("Snuffy", 11500)
    var fish = Pet("Nemo", 11000)
    var rabbit = Pet("Bugs", 13500)

    GlobalScope.launch {
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

    println("Еда роздана")
    sleep(16000)
}