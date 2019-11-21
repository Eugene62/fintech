package ru.tinkoff.lesson_15

import java.util.*

val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    val s = scan.next()
    print(isCapitalized(s))
}


//fun isCapitalized(s: String?): Boolean {
//    val regexForStr = "[\\p{Lu}].*".toRegex()
//    if (s!!.matches(regexForStr))
//        return true
//    else
//        return false
//}

fun isCapitalized(s: String?): Boolean {
    val regexForStr = "[\\p{Lu}].*".toRegex()
    return s!!.matches(regexForStr)
}