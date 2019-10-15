package ru.tinkoff

class Owner<T : Pet>(val pet: T) {
    fun feed(): String {
        return "Домашнее животное ${pet.nickname} накормлено"
    }
}