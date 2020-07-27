package academy.learnprogramming.inheritance

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother")
    laserPrinter.printModel()

    SomethingElse("whatever")
}

abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

//
open class LaserPrinter(modelName: String) : Printer(modelName) {

    override fun printModel() = println("testing")
    override fun bestSellingPrice(): Double = 129.99
}

open class Something {
    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I am in the parent")
    }
}

class SomethingElse : Something {

    constructor(sometOtherParameter: String) : super(sometOtherParameter) {
        println("I am in the child")
    }
}

interface MyInterface {
        
}