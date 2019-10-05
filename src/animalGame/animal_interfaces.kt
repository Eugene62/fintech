package ru.tinkoff

/*
* Интерфейс для летающих животных
*/
interface Flyeble{
    fun fly()
}

/*
* Интерфейс для животных, способных передвигаться на своих лапах
*/
interface Walkable{
    fun walk()
}

/*
* Интерфейс для животных умеющх плавать
*/
interface Swimable{
    fun swim()
}

/*
* Интерфейс для животных способных ползать
*/
interface Crawlable{
    fun crawl()
}

/*
* Интерфейс для животных, способных подать голос
*/
interface Voiceable{
    fun voice()
}