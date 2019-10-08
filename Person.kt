data class Person(
    val firstName: String,
    val lastName: String,
    val age:Int,
    val postIndex:String,
    val phoneNumber:String
) {
}

fun main() {
    val personIvan = Person("Ivan", "Pupckin", 19, "390048", "+79969119630" )
    val personMaks = Person("Maks", "Isaev", 24, "390039", "+79209640700" )
    val personSecondMaks = Person("Maks", "Ashurkov", 22, "390039", "+79208886688" )

    println( personIvan.equals(personMaks))
    println( personIvan.equals(personIvan))
    if ( personMaks.firstName.equals(personSecondMaks.firstName)) println( "${personMaks.firstName} идентичен ${personSecondMaks.firstName}" )
}