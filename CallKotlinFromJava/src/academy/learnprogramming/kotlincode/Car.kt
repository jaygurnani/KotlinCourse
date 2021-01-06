@file:JvmName("StaticCar")
package academy.learnprogramming.kotlincode

fun topLevel() = println("I am in the car file")

object SingletonObj {
	@JvmStatic fun doSomething() = println("I am doing something in the singleton object")
}



class Car(val color: String, @JvmField val model: String, val year: Int,
			val isAutomatic: Boolean) {

	companion object {
		@JvmStatic fun carComp() = "I am in cars companion object"
	}

	@JvmOverloads fun defaultArgs(str: String, number: Int = 25) {

	}
}

fun main(args: Array<String>){
	"test".print()
}

fun String.print() {
	println(this)
}