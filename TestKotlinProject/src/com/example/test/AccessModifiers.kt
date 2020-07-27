package com.example.test

// Constants can be outside a class
val MY_CONSTANT = 100

fun main(args: Array<String>) {

	println(MY_CONSTANT)

	// Can use a private class
	val emp = Employee("John")
	println(emp.firstName)
	println(emp.fullTime)

	val car1 = Car("Blue", "Test", 1)
	val car2 = car1.copy(color = "White")
	println(car2)
}

// Complex form
//class Employee constructor(firstName: String) {
//
//	val firstName: String
//
//	init {
//		this.firstName = firstName
//	}
//
//}

// Simplified form -1
//class Employee constructor(val firstName: String) {
//
// 	Primary constructor needs to be called in a secondary constructor
//	The "this" does that
//	constructor(firstName: String, val fullTime: Boolean): this(firstName) {
//	}
//}

// Simplified form - 2
class Employee(val firstName: String, fullTime: Boolean = true) {

	var fullTime = fullTime
	get() {
		print("Running custom field")
		return field
	}
	set(input: Boolean) {
		print("Testing")
		field = input
	}
}

// Get few things for free - toString, Equals, hashCode
// Cannot be abstract or sealed

data class Car(val color: String, val model: String, val year: Int) {

}