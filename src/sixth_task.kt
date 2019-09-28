fun main(args:Array<String>){

    var inputData:IntArray = intArrayOf(9, 15, 5, 2, 1, 3, 4 , 7, 10, 12)

    for (i in mySort(inputData))
    println(i)
}

fun mySort(inputArray: IntArray):IntArray {
    if ( inputArray.size < 2)
        return inputArray
    else {
        val supElem = inputArray[inputArray.size/2]

        var less:ArrayList<Int> = ArrayList(0)
        var greater:ArrayList<Int> = ArrayList(0)
        for (i in inputArray.indices)
            if( i != inputArray.size/2)
            if (inputArray[i] < supElem )
                less.add(inputArray[i])
            else
                greater.add(inputArray[i])

        return mySort(less.toIntArray()) + supElem + mySort(greater.toIntArray())

    }
}