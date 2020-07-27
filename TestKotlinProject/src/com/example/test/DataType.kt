package com.example.test

fun main1(args: Array<String>){

	// Create an array with a lambda functions
	val evenNumbers = Array(16) { i -> i * 2 }
	for(number in evenNumbers ){
		println(number)
	}
	val lotsOfNumbers = Array(10000) { i -> i + 1 }

	val allZeros = Array(100) { 0 }

	var someArray: Array<Int>
	someArray = arrayOf(1, 2, 3, 4)

	for(number in someArray){
		println(number)
	}

	val mixedArray = arrayOf("Hello", 1, 10.5)

	// You can create the size in a primtive (java defintion) array, but cannot do this in non-primitive types
	var someOtherArray = IntArray(5)

	// Smart casting 
	val something: Any = listOf(1,2, 3, 4)
	// Safe casting
	val str3: String? = something as? String
	print(str3)

	// Let function
	val str: String? = "This isn't null"
	// If str is not null, call the method inside the let function
	str?.let { println(it) }

}

fun printText(text: String){
	println(text)
}