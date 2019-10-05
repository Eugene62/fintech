package ru.tinkoff

import kotlin.system.exitProcess

fun choosePet() : String? {
    val availablePets = listOf<String>( "Dog", "Cat", "Parrot", "Fish", "Snake" )
    for ( i in availablePets )
        println( "$i" )
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

    val zoo: Map<String, AbstractPet> = mapOf( "Dog" to dog , "Cat" to cat, "Parrot" to parrot, "Fish" to fish, "Snake" to snake )
    
    println("Добро пожаловать в игру \"Томагочи\"")
    println("Для выбора животного введите его название")
    println( "Введите \"q\" для выхода" )

    val player: Player? = zoo[choosePet()]?.let { Player(it) }

    player?.printAvailableCommands()

    do {
        val tempStr : String? = readLine()
        player?.proccedAnimalCommand( processQuit( tempStr ) )

    }while ( true )
}