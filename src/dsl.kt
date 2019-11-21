package ru.tinkoff.lesson_14.filter


fun main() {
    val result =
        xml {
            name { +"Женя" }
            surname { +"Мирохин" }
            birthDate { +"22.04.1993" }

            addresses {
                address { +"Новоселов" }
                address { +"Зубковой" }
                address { +"Красногвардейская" }
            }
        }

    println(result)
}

val lineBreakTags = listOf("object", "addresses")

fun xml(init: XML.() -> Unit): XML {
    val xml = XML()
    xml.init()
    return xml
}

class XML() : XmlText("object") {
    fun name(init: Name.() -> Unit): Name {
        return initTag(Name(), init)
    }

    fun surname(init: Surname.() -> Unit): Surname {
        return initTag(Surname(), init)
    }

    fun birthDate(init: BirthDate.() -> Unit): BirthDate {
        return initTag(BirthDate(), init)
    }

    fun addresses(init: Addresses.() -> Unit): Addresses {
        return initTag(Addresses(), init)
    }
}

class Name() : XmlText("name")
class Surname() : XmlText("surname")
class BirthDate() : XmlText("birthDate")

class Addresses() : XmlText("addresses") {
    fun address(init: Address.() -> Unit): Address {
        return initTag(Address(), init)
    }
}

class Address() : XmlText("address")

interface Element {
    fun printElement(builder: StringBuilder)
}

class TextElement(val text: String) : Element {
    override fun printElement(builder: StringBuilder) {
        builder.append("$text")
    }
}

abstract class Tag(val name: String) : Element {
    val blocks = arrayListOf<Element>()

    protected fun <T : Element> initTag(tag: T, init: T.() -> Unit): T {
        tag.init()
        blocks.add(tag)
        return tag
    }

    override fun printElement(builder: StringBuilder) {
        builder.append("<$name>")

        if (lineBreakTags.contains(name))
            builder.append("\n")

        blocks.forEach { it.printElement(builder) }
        builder.append("</$name>\n")
    }

    override fun toString(): String {
        val builder = StringBuilder()

        printElement(builder)

        return builder.toString()
    }
}

abstract class XmlText(name: String) : Tag(name) {
    operator fun String.unaryPlus() {
        blocks.add(TextElement(this))
    }
}