package academy.learnprogramming.upperbound

import java.lang.Appendable

fun main(args: Array<String>) {

    val ints = listOf(1,2,3,4,5)
    val shorts: List<Short> = listOf(10,20,30,40)
    val floats: List<Float> = listOf(100.3f, -459.43f)
    val strings = listOf("1", "2", "3")

    if (strings is List<String>) {
        println("This list of contains string")
    }

    var listAny: Any = listOf("str1", "str2")
    if (listAny is List<*>) {
        println("Yes this is a list. thank you star projection!")
    }

    listAny = listOf(1,2,3)
    if (listAny is List<*>) {
        val strList = listAny as List<String>
        println(strList[1].replace("str", "string"))
    }

//    convertToInt(floats)
//    convertToInt(shorts)

    append(StringBuilder("String 1"), StringBuilder("String 2"))

    //printCollection(shorts)
    printCollection(floats)
}

fun <T: Any> printCollection(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}

fun <T: Number?> convertToInt(collection: List<T>) {
    for(num in collection) {
        println("${num?.toInt()}")
    }
}

fun <T> append(item1: T, item2: T) where T: CharSequence, T: Appendable {
    println("Result is ${item1.append(item2)}")
}