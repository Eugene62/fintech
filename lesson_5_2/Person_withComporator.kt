data class Person(
    val firstName: String,
    val lastName: String,
    val age:Int,
    val postIndex:String,
    val phoneNumber:String
) {
    companion object PersonComparator:Comparator<Person>{
        override fun compare(o1: Person, o2: Person): Int {
            var age1 = o1.age
            var age2 = o2.age

            if ( age1 - age2 == 0 )
                return 0
            else if ( age1 > age2 )
                return -1
            else
                return 1
        }

    }
}

fun main() {
    val personIvan = Person("Ivan", "Pupckin", 19, "390048", "+79969119630" )
    val personMaks = Person("Maks", "Isaev", 24, "390039", "+79209640700" )
    val personSecondMaks = Person("Maks", "Ashurkov", 22, "390039", "+79208886688" )

    println( personIvan.equals(personMaks))
    println( personIvan.equals(personIvan))

    if ( personMaks.firstName.equals(personSecondMaks.firstName)) println( "${personMaks.firstName} идентичен ${personSecondMaks.firstName}" )

    println( personComporator.compare( personIvan, personMaks ) )
    println( personComporator.compare( personMaks, personIvan ) )
    println( personComporator.compare( personMaks, personMaks ) )

    println( Person.compare( personIvan, personMaks ) )
    println( Person.compare( personMaks, personIvan ) )
    println( Person.compare( personMaks, personMaks ) )

}