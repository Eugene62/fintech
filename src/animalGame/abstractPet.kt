package ru.tinkoff

import kotlin.system.exitProcess

abstract class AbstractPet(  val name:String, val age:Int ){
    abstract protected val messageForPlaytime : String
    protected var isCleanInHabitat : Boolean = true
    abstract protected val habitat : String
    abstract protected val messageForMealTaking : String
    protected var mealTakingCount : Int = 0
    abstract protected val petDescription : String
    abstract fun getCommands(): Array<String>
    abstract fun proccedCommand( command:String? )

    fun mealTaking(){
        println( messageForMealTaking )
        ++mealTakingCount
        if (mealTakingCount == 2) leave()
        if ( mealTakingCount > 0 ) {
            isCleanInHabitat = false
            println( "Не забудь убраться в $habitat")
            }
    }

    fun leave(){
            println( "Ваша $petDescription, покинула вас " )
            exitProcess(0 )
    }

    fun cleanAfterMe(){
        if ( isCleanInHabitat )
            println( "Не требуется уборка" )
        else {
            println("С явным недовольствим вы убираете в $habitat")
            isCleanInHabitat = true
        }
    }

    fun playWithMe(){
        println( messageForPlaytime )
    }
}