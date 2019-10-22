package ru.tinkoff
import java.lang.Exception

fun main() {
    try {
        listOf("поезд", "сделал", "one").forEach {
            if (it == "one") {
                //throw Exception("boom =)")
                return
            }
            println(it)
        }
    } catch (e:Exception){}
    finally {
        println("boom!")
    }
}

// public inline fun <T> Iterable<T>.forEach(action: (T) -> Unit): Unit {
//     for (element in this) action(element)
// }
// Вот во что развернулся инлайновый forEach. На лекции мы обсуждали недостатки инлайн функций
// и то что каждый раз создается новый объект при каждом вызове. Можно вылечить с помощью объявления <reified>