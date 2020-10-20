package academy.learnprogramming.trycatch

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main(args: Array<String>){
//    println(getNumber("22.5") ?: "I can't print the result")
    notImplementedYet("test")
}

fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Test")
}

fun getNumber(str:String): Int? {
    return try {
        Integer.parseInt(str)
    }
    catch (e: NumberFormatException){
        null
    }
    finally {
        println("I am in the finally block")
    }
}