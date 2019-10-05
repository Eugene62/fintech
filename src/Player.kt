package ru.tinkoff

class Player( val animal : AbstractPet ) {
    fun printAvailableCommands(){
        for ( i in animal.getCommands() )
            println( i )
    }

    fun proccedAnimalCommand( command: String? ){
        animal.run { this.proccedCommand( command ) }
    }
}