fun main(args:Array<String>) {
    println("Enter your numbers:")
    val inputArray = readLine()!!.split(" ")

    if( inputArray.size != 4 )
        println("Size of array is wrong! Need 4")
    else
        println(findMin(inputArray))
}

fun findMin(input:List<String>):Int{
    var temp:Int = input[0].toInt()
    for( i in input )
        if ( i.toInt() < temp )
            temp = i.toInt()
    return temp
}