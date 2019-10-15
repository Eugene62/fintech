package ru.tinkoff

open class Pet(var nickname: String, var age: Int, var sex: String?) {
}

class Dog(name: String, age: Int, sex: String?) : Pet(name, age, sex)

class Cat(name: String, age: Int, sex: String?) : Pet(name, age, sex)

fun Pet.isAdult(): Boolean {
    return if (this.age > 2) return true else false
}

val Pet.politeName
    get() = "Dear, ${this.nickname}!"

val Dog.politeName
    get() = "Dear dog, ${this.nickname}!"