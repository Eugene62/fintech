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

    val anotherAnotherDog: Dog = Dog("Fluffy", 5, "male")
    val cat: Cat = Cat("Tom", 7, "male")

    val firstOwner = Owner(anotherAnotherDog)
    val secondOwner: Owner<Cat> = Owner(cat)

    println(firstOwner.feed())
    println(secondOwner.feed())
}