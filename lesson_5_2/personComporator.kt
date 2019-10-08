object personComporator: Comparator<Person> {
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