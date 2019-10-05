package ru.tinkoff

fun main( args: Array<String> ) {
    val dog = Dog("Goofy", 23 )
    val cat = Cat("Tom", 7 )
    val parrot = Parrot( "Iago", 12 )
    val snake = Snake( "Kaa", 48 )
    val fish = Fish( "Nemo", 2 )

    println( dog.name )
    println( dog.age )

    dog.voice()
    dog.crawl()
    dog.swim()
    dog.walk()
    dog.playWithMe()
    dog.mealTaking()
    dog.mealTaking()
    dog.cleanAfterMe()

    println( cat.name )
    println( cat.age )

    cat.voice()
    cat.cleanAfterMe()
    cat.crawl()
    cat.swim()
    cat.walk()
    cat.playWithMe()
    cat.mealTaking()

    println( parrot.name )
    println( parrot.age )

    parrot.voice()
    parrot.cleanAfterMe()
    parrot.fly()
    parrot.walk()
    parrot.playWithMe()
    parrot.mealTaking()

    println( snake.name )
    println( snake.age )

    snake.voice()
    snake.cleanAfterMe()
    snake.crawl()
    snake.playWithMe()
    snake.mealTaking()

    println( fish.name )
    println( fish.age )

    fish.voice()
    fish.cleanAfterMe()
    fish.swim()
    fish.playWithMe()
    fish.mealTaking()
}