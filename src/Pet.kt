package ru.tinkoff

import kotlinx.coroutines.delay

class Pet(val nickName: String, val mealDuration: Long) {
    suspend fun eat() {
        kotlinx.coroutines.delay(mealDuration)
        println("${nickName} покушал")
    }
}