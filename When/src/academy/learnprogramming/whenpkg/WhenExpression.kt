package academy.learnprogramming.whenpkg

import java.math.BigDecimal

enum class Season {
	SPRING, SUMMER, FALL, WINTER
}

fun main(args: Array<String>){
	var num = 200

	val timeOfYear = Season.WINTER
	val str = when(timeOfYear){
		Season.SPRING -> {
			num += 5
			"Flowers blooming"
		}
		Season.SUMMER -> "It is hot"
		Season.FALL -> "Its cooler"
		Season.WINTER -> "I need a coat"
	}

	println(str)


	when(num){
		// Multiple cases
		100, 600 -> println("100")
		in 100..199 -> println("range")
		200 -> println("300")
		else -> println("Doesn't match anything")
	}

	val obj1: Any = "I am a string"
	val obj2: Any = BigDecimal(2.5)
	val obj3: Any = 45

	val something: Any = obj2

	val z = when(something) {
		is String -> println(something.toString())
		is BigDecimal -> println(something.remainder((BigDecimal(2.4))))
		else -> println("123")
	}


	val num2 = -50
	when {
		num < num2 -> println("num2")
		num > num2 -> println("num3")
	}

}