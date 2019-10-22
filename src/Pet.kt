package ru.tinkoff

import com.sun.org.apache.xpath.internal.operations.Bool
import kotlinx.coroutines.delay

class Pet(val nickName: String, val mealDuration: Long) {
    suspend fun eat(): Boolean {
        kotlinx.coroutines.delay(mealDuration)
        println("${nickName} покушал")
        return true
    }
}