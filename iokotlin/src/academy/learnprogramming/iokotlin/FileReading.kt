package academy.learnprogramming.iokotlin

import java.io.File

fun main (args: Array<String>) {
    File("testfile.txt").reader().useLines { it.forEach { println(it) } }
}