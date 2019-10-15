package ru.tinkoff

data class Pet(var nickname: String, var age: Int, var sex: String?) {
}

fun Pet.isAdult(): Boolean {
    return if (this.age > 2) return true else false
}

val Pet.politeName
    get() = "Dear, ${this.nickname}!"