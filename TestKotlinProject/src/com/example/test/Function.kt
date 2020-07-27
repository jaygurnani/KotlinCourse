package com.example.test

import java.time.Year

fun main(args: Array<String>) {
	println(labelMultiply(3, 4, "Result is"))
	val emp = EmployeeFunctions("Jane")
	println(emp.upperCaseFirstName())

	val car1 = CarsFunction(2000)
	val car2 = CarsFunction(2001)

	val manyCars = arrayOf(car1, car2)
	printColours(*manyCars)
}

fun labelMultiply (operand1: Int, operand2: Int, label: String) = "$label ${operand1 * operand2}"

class EmployeeFunctions(val firstName: String) {
	fun upperCaseFirstName() = firstName.toUpperCase()
}

fun printColours(vararg cars: CarsFunction) {
	for (car in cars){
		println(car.year)
	}
	val test = "this is the first and last"
	println(test.upperFirstAndLast())
}

// Extension method
fun String.upperFirstAndLast(): String {
	val upperFirst = this.substring(0, 1).toUpperCase() + this.substring(1)
	return upperFirst.substring(0, upperFirst.length -1) + upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}

data class CarsFunction(val year: Int) {

}