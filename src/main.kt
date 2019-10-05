package ru.tinkoff

import kotlin.system.exitProcess

fun printGreeting() {
    println("Добро пожаловать в игру \"Томагочи\"")
}

fun printMenu() : String? {
    println( "Выберите действие:" )
    println( "1. Выбрать питомца" )
    println( "Введите \"q\" для выхода" )
    return processQuit( readLine() )
}

fun processQuit( strForCheck : String? ) : String? {
    if ( strForCheck.equals( "q") ) {
        exitProcess(0 )
    }
    else
        return strForCheck
}

fun main( args: Array<String> ) {

    val dog : Dog = Dog("Goofy", 13 )
    val cat : Cat = Cat( "Tom", 5 )
    val parrot : Parrot = Parrot( "Iago", 7 )
    val snake : Snake = Snake("Kaa", 48 )
    val fish : Fish = Fish("Nemo", 2 )

    val availablePets = listOf<String>( "Dog", "Cat", "Parrot", "Fish", "Snake" )
    val zoo: Map<String, AbstractPet> = mapOf( "Dog" to dog , "Cat" to cat, "Parrot" to parrot, "Fish" to fish, "Snake" to snake )

    val circle = true
    printGreeting()
    println("Для выбора животного введите его название")
    if ( printMenu()?.toInt() == 1 )
        for ( i in availablePets )
            println( "$i" )

    val selectedPet : String = readLine().toString()

    val pet = zoo[selectedPet]

    val player: Player? = zoo[selectedPet]?.let { Player(it) }

    player?.printAvailableCommands()

    do {
        val tempStr : String? = readLine()
        player?.proccedCommand( processQuit( tempStr ) )

    }while ( circle != false )
}