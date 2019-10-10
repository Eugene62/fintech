data class Pet( var nickname: String, var age:Int, var sex:String? ) {
}

fun main(){
    var dog:Pet = Pet( "Goofy", 12, null )

    dog = dog.apply{
        this.sex = "male"
    }

    dog = dog.also {
        it.sex = "female"
        it.nickname =  "Kate"
        it.age = 15
    }

    dog = dog.let{
        it.nickname = "Scratchy"
        it.age = 5
        it.sex = "male"
        it
    }

    dog = with(dog){
        this.age = 6
        this.nickname = "Scarlett"
        this.sex = "female"
        this
    }

    // Лучше всего для инициализации полей класса подходят : apply и also. Мнение субъективное,
    // как минимум удобнее лишь только потому что не требуется явно возвращать объект.
    // Если еще сильнее сильнее субъективизировать оценку, то apply подходит из-за обращения к объекту с помощью this,
    // что является аналогичным обращением к полям собственного объекта в c++
}

