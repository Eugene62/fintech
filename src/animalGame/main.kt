package ru.tinkoff

import kotlin.system.exitProcess

//! Выбор питомца и его имени с возрастом
fun choosePet() : AbstractPet {
    val availablePets = listOf<String>( "Dog", "Cat", "Parrot", "Fish", "Snake" )
    for ( i in availablePets )
        println( "$i" )

    val petType = processQuit( readLine() )
    println( "Введите имя" )
    val petName = processQuit( readLine() )
    println( "Введите возраст" )
    val petAge = processQuit( readLine() )
    when ( petType )
    {
        "Dog" -> return Dog( petName, petAge.toInt() )
        "Cat" -> return Cat( petName, petAge.toInt() )
        "Parrot" -> return Parrot( petName, petAge.toInt() )
        "Fish" -> return Fish( petName, petAge.toInt() )
        "Snake" -> return Snake( petName, petAge.toInt() )
        else -> throw Exception( "Такого животного нет" )
    }
}

//! проверка вводимой строки
//! так же проверяется условие выхода из программы
fun processQuit( strForCheck : String? ) : String {
    if ( strForCheck != null ) {
        if ( strForCheck.equals( "q" ) ) {
            exitProcess(0)
        } else
            return strForCheck
    }
    else
        throw Exception( "Empty string" )
}

fun main( args: Array<String> ) {

    println("Добро пожаловать в игру \"Томагочи\"")
    println("Для выбора животного введите его название")
    println( "Введите \"q\" для выхода" )

    try {
        val player = Player(choosePet())
        player.printAvailableCommands()

        do {
            val tempStr : String? = readLine()
            player.proccedAnimalCommand( processQuit( tempStr ) )

        }while ( true )
    }
    catch ( e: Exception )
    {
        println( e.message )
    }
}