fun main(args:Array<String>) {
    println("Enter your number and string:")
    val(num, str) = readLine()!!.split(" ")
    printYourStr( num, str )
}

fun printYourStr(number:String, str:String){
    val regexForNum:Regex = "[0-9]+".toRegex()
    if (number.matches(regexForNum) && !str.matches(regexForNum))
        for (i in 0 until number.toInt())
            println("$str")
    else
        println("Wrong input data: need number and string")
}