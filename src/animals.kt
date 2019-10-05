package ru.tinkoff

/*
* Класс описывающий поведение собаки. Может ходить, ползать, плавать и подовать голос.
 */
class Dog( name: String, age: Int ) : AbstractPet( name, age ), Walkable, Swimable, Crawlable, Voiceable {
    override fun proccedCommand(command: String) {
        when ( command )
        {
            "walk" -> return this.walk()
            "swim" -> return this.swim()
            "crawl" -> return this.crawl()
            "voice" -> return this.voice()
            "meal" -> this.mealTaking()
            "play" -> this.playWithMe()
            "clean" -> this.cleanAfterMe()
        }
    }

    override fun getCommands(): Array<String> {
        return arrayOf( "walk", "swim", "crawl", "voice", "meal", "play", "clean" )
    }

    override val petDescription: String = "собака"
    override val messageForMealTaking: String = "Радостно уплетает корм из миски"
    override val habitat: String = "конуре"
    override val messageForPlaytime: String = "Вы бросаете палку, радостный пес убегает и приносит ее"

    override fun walk() {
        println( "Ходит по собачьи, виляя хвостом" )
    }

    override fun swim() {
        println( "Плавает по собачьи" )
    }

    override fun crawl() {
        println( "Ползает по собачьи, подкрадывается к вам и кусает за ногу" )
    }

    override fun voice() {
        println( "Разговаривает по собачьи, вы слышите: \"Гав-гав\"" )
    }
}

/*
* Класс описывающий поведение кошки. Может ходить, ползать, плавать и подовать голос.
 */
class Cat( name: String, age: Int ) : AbstractPet( name, age ), Walkable, Swimable, Crawlable, Voiceable {
    override fun proccedCommand(command: String) {
        when ( command )
        {
            "walk" -> return this.walk()
            "swim" -> return this.swim()
            "crawl" -> return this.crawl()
            "voice" -> return this.voice()
            "meal" -> this.mealTaking()
            "play" -> this.playWithMe()
            "clean" -> this.cleanAfterMe()
        }
    }

    override fun getCommands(): Array<String> {
        return arrayOf( "walk", "swim", "crawl", "voice", "meal", "play", "clean" )
    }

    override val petDescription: String = "кошка"
    override val messageForMealTaking: String = "С явным недовольством смотрит на еду в миске, но так происхдит всегда, не смотря на то что в ней лежит"
    override val habitat: String = "кошачей лежашке( не обманывайте себя, эта квартира принадлежит кошке на самом деле, а не вам )"
    override val messageForPlaytime: String = "Кошка приходит к вам на колени и ждет что вы погладите ее. К сожалению вы гладите не в том месте, она царапает вас и уходит"

    override fun walk() {
        println( "Ходит по кошачьи, высокомерно поглядывая по сторонам" )
    }

    override fun swim() {
        println( "Плавает по кошачьи, явно имея раздраженное настроение" )
    }

    override fun crawl() {
        println( "Ползает по кошачьи, не понимая зачем вы ее научили этому" )
    }

    override fun voice() {
        println( "Разговаривает по кошачьи, вы слышите: \"Мяу\"" )
    }
}

/*
* Класс описывающий поведение попугая. Может ходить, летать и подовать голос.
 */
class Parrot( name: String, age: Int ) : AbstractPet( name, age ), Flyeble, Walkable, Voiceable {
    override fun proccedCommand(command: String) {
        when ( command )
        {
            "walk" -> return this.walk()
            "fly" -> return this.fly()
            "voice" -> return this.voice()
            "meal" -> this.mealTaking()
            "play" -> this.playWithMe()
            "clean" -> this.cleanAfterMe()
        }
    }

    override fun getCommands(): Array<String> {
        return arrayOf( "walk", "fly", "voice", "play", "clean" )
    }

    override val petDescription: String = "птица"
    override val messageForMealTaking: String = "Вы наыпаете еды в кормушку. Попугай прекращает грызть клавиатуру ноутбука и летит к кормушке"
    override val habitat: String = "клетке"
    override val messageForPlaytime: String = "Безбашенно летает по комнате, периодичеки изображая из себя японского камикадзе"

    override fun fly() {
        println( "Летает, в поискх цели для рстерзания")
    }

    override fun walk() {
        println( "Ходит, хотя и не понимает зачем ему это нужно" )
    }

    override fun voice() {
        println( "Говорит на языке попугаев, вы слышите: \"Попка-дурак\"" )
    }
}

/*
* Класс описывающий поведение рыбы. Может плавать и подовать голос.
 */
class Fish( name: String, age: Int ) : AbstractPet( name, age ), Swimable, Voiceable {
    override fun proccedCommand(command: String) {
        when ( command )
        {
            "swim" -> return this.swim()
            "voice" -> return this.voice()
            "meal" -> this.mealTaking()
            "play" -> this.playWithMe()
            "clean" -> this.cleanAfterMe()
        }
    }

    override fun getCommands(): Array<String> {
        return arrayOf( "swim", "voice", "meal", "play", "clean" )
    }

    override val petDescription: String = "рыбка"
    override val messageForMealTaking: String = "Вы бросаете еду в аквариум. Рыбка подплывает, кушает и плывет на дно. Спустя три секунды возвращается обратно  к корму"
    override val habitat: String = "аквариуме"
    override val messageForPlaytime: String = "Плавает кругами"

    override fun swim() {
        println( "Хаотично передвигается по аквариуму" )
    }

    override fun voice() {
        println( "Вы стучите рукой по стеклу аквариума в надежде что рыбка подаст голос. Она смотрит на вас недоумевающим взглядом и уплывает. Возвращается спустя три секунды" )
    }
}

/*
* Класс описывающий поведение змеи. Может ползать и подовать голос.
 */
class Snake( name: String, age: Int ) : AbstractPet( name, age ), Crawlable, Voiceable{
    override fun proccedCommand(command: String) {
        when ( command )
        {
            "crawl" -> return this.crawl()
            "voice" -> return this.voice()
            "meal" -> this.mealTaking()
            "play" -> this.playWithMe()
            "clean" -> this.cleanAfterMe()
        }
    }

    override fun getCommands(): Array<String> {
        return arrayOf( "swim", "voice", "meal", "play", "clean" )
    }

    override val petDescription: String = "змея"
    override val messageForMealTaking: String =  "Так как вы все еще не знаете где змея, вы просто выпускаете мышей в квартире"
    override val habitat: String = "Вы все еще не знаете где змея, поэтому убираетесь во всей квартире"
    override val messageForPlaytime: String = "Вы не понимаете зачем вы завели змею и боитесь с ней играть. Да даже если бы и не боялись, вы все равно не знаете где она"

    override fun crawl() {
        println( "Ползет по змеиному" )
    }

    override fun voice() {
        println( "Разговаривает по змеиному, вы слышите: [Шипение]" )
    }
}