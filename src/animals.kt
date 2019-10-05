package ru.tinkoff

/*
* Класс описывающий поведение собаки. Может ходить, ползать, плавать и подовать голос.
 */
class Dog( val name: String, val age: UInt ): Walkable, Swimable, Crawlable, Voiceable {

    override fun walk(){
        println( "Ходит по собачьи, виляя хвостом" )
    }

    override fun swim() {
        println( "Плавает по собачьи" )
    }

    override fun crawl() {
        println( "Ползает по собачьи" )
    }

    override fun voice() {
        println( "Разговаривает по собачьи, вы слышите: Гав-гав" )
    }
}

/*
* Класс описывающий поведение кошки. Может ходить, ползать, плавать и подовать голос.
 */
class Cat(val name: String, val age: UInt): Walkable, Swimable, Crawlable, Voiceable {

    override fun walk(){
        println( "Ходит по кошачьи, высокомерно поглядывая по сторонам" )
    }

    override fun swim() {
        println( "Плавает по кошачьи, явно имея раздраженное настроение" )
    }

    override fun crawl() {
        println( "Ползает по кошачьи, не понимая зачем вы ее научили этому" )
    }

    override fun voice() {
        println( "Разговаривает по кошачьи, вы слышите: Мяу" )
    }
}

/*
* Класс описывающий поведение попугая. Может ходить, летать и подовать голос.
 */
class Parrot(val name: String, val age: UInt) : Flyeble, Walkable, Voiceable {

    override fun fly() {
        println( "Летает, в поискх цели для рстерзания")
    }

    override fun walk() {
        println( "{Ходит, хотя и не понимает зачем ему это нужно" )
    }

    override fun voice() {
        println( "Говорит на языке попугаев, вы слышите: Попка-дурак" )
    }
}

/*
* Класс описывающий поведение попугая. Может плавать и подовать голос.
 */
class Fish(val name: String, val age: UInt) : Swimable, Voiceable {

    override fun swim() {
        println( "Хаотично передвигается по аквариуму" )
    }

    override fun voice() {
        println( "Вы стучите рукой по стеклу аквариума в надежде что рыбка подаст голос. Она смотрит на вас недоумевающим взглядом и уплывает" )
    }
}

/*
* Класс описывающий поведение змеи. Может ползать и подовать голос.
 */
class Snake(val name: String, val age: UInt) : Crawlable, Voiceable{

    override fun crawl() {
        println( "Ползет по змеиному" )
    }

    override fun voice() {
        println( "Разговаривает по змеиному, вы слышите: [Шипение]" )
    }
}