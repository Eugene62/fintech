package ru.tinkoff

fun main(args: Array<String>) {

    val inputStringArray: String? = readLine();

    checkString(inputStringArray)

}

fun checkString(inputStringArray: String?) {
    val openBrackets = listOf('(', '{', '[')
    val availableChars = listOf('(', ')', '[', ']', '{', '}')
    val mutableStack: MutableList<Char> = mutableListOf<Char>();
    val minPosOpenedBracket: MutableList<Int> = mutableListOf()
    var count: Int = 0

    if (inputStringArray != null) {
        for (char in inputStringArray) {
            ++count
            if (char in availableChars) {
                if (openBrackets.contains(char)) {
                    minPosOpenedBracket.add(count)
                    mutableStack.add(char)
                } else {
                    if (mutableStack.isEmpty()) {
                        println(count)
                        return
                    }
                    val top = mutableStack[mutableStack.lastIndex]
                    if (top == '[' && char != ']' || top == '(' && char != ')' || top == '{' && char != '}') {
                        println(count)
                        return
                    }
                    mutableStack.removeAt(mutableStack.lastIndex)
                    minPosOpenedBracket.removeAt(minPosOpenedBracket.lastIndex)
                }
            }
        }
        if (mutableStack.isNotEmpty())
            println(minPosOpenedBracket.last())
        else
            println("Success")
    }
}
