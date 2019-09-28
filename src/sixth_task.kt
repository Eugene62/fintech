fun main(args:Array<String>){

    var inputData:ArrayList<Int> = arrayListOf(9, 15, 5, 2, 1, 3, 4 , 7, 10, 12, 22, 43, 5, 4, 26)

    for (i in mySort(inputData))
        print("$i ")
}

fun mySort(inputArray: ArrayList<Int>):ArrayList<Int> {
    if (inputArray.size < 2)
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

        return (mySort(less) + supElem + mySort(greater)) as ArrayList<Int>
    }
}