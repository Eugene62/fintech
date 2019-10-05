package ru.tinkoff

import kotlin.system.exitProcess

abstract class AbstractPet(  val name:String, val age:Int ){
    abstract protected val messageForPlaytime : String          //!< Сообщение, которое выводится во время игры с питомцем
    protected var isCleanInHabitat : Boolean = true             //!< Отвечает за чистоту в жилище питомца, по умолчанию чисто
    abstract protected val habitat : String                     //!< Описывает жилище питомца
    abstract protected val messageForMealTaking : String        //!< Сообщение во время кормежки питомца
    protected var mealTakingCount : Int = 0                     //!< Счетчик количества употреблений пищи
    abstract protected val petDescription : String              //!< Описание питомца
    abstract fun getCommands(): Array<String>                   //!< Список команд, доступный питомцу
    abstract fun proccedCommand( command:String )               //!< Выполнение команды

    //! Функция для кормления питомца
    fun mealTaking(){
        println( messageForMealTaking )
        ++mealTakingCount
        if (mealTakingCount == 2) leave()
        if ( mealTakingCount > 0 ) {
            isCleanInHabitat = false
            println( "Не забудь убраться в $habitat")
            }
    }

    //! Функция, описывающая при каких условиях питомец убежит
    fun leave(){
            println( "Ваша $petDescription, покинула вас " )
            exitProcess(0 )
    }

    //! Функция уборки за питомцем
    fun cleanAfterMe(){
        if ( isCleanInHabitat )
            println( "Не требуется уборка" )
        else {
            println("С явным недовольствим вы убираете в $habitat")
            isCleanInHabitat = true
            mealTakingCount = 0
        }
    }

    //! Функция игры с питомцем
    fun playWithMe(){
        println( messageForPlaytime )
    }
}