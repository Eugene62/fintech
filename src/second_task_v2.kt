fun minFinder(a:Int, b:Int, c:Int, d:Int): Int{

    if ( a < b  && a < c && a < d )
        return a
    else if ( b < c && b < d )
        return b
    else if ( c < d ) return c else return d

}