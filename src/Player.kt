package ru.tinkoff

/*
* Класс владельца питомца
* в конструктор принимает объект питомца
 */
class Player( val animal : AbstractPet ) {
    //! Вывод доступных команд у текущего питомца
    fun printAvailableCommands(){
        for ( i in animal.getCommands() )
            println( i )
    }

    //! Приаз на выполнение команды питомцем
    fun proccedAnimalCommand( command: String ){
        animal.run { this.proccedCommand( command ) }
    }
}