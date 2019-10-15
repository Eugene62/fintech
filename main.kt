package ru.tinkoff

fun main() {
    val myPet = Pet("Jerry", 17, "male")
    println(myPet.isAdult())
    println(myPet.politeName)

    val dog: Pet = Dog("Goofy", 4, "male")
    println(dog.politeName)

    if (dog is Dog)
        println(dog.politeName)

    val anotherDog: Dog = Dog("Scratchy", 5, "male")
    println(anotherDog.politeName)

    //! В зависимости от типа объявления переменной класса наследника, будет вызвана функция относящаяся к объявленному классу
}