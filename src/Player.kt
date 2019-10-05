package ru.tinkoff

class Player( val animal : AbstractPet ) {
    fun printAvailableCommands(){
        for ( i in animal.getCommands() )
            println( i )
    }

    fun proccedCommand( command: String? ){
        animal.run { proccedCommand( command ) }
    }
}