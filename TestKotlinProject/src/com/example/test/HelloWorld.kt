package com.example.test
typealias EmployeeSet = Set<Employee1>

fun mainOld(args: Array<String>) {
	// val == immutable variable. Only assigned once
	val number = 24
	val test: Int
	// var
	var abc = "asd"
	abc = "xyz"

	val employee1 = Employee1("testing", 1123)
	val employee2: Employee1

	if (1 < 2){
		employee2 = Employee1("Bob", 1)
	} else {
		employee2 = Employee1("Jane", 1)
	}

	val employees: EmployeeSet

	val employeOne = Employee1("Mary", 1)
	val employeTwo = Employee1("John", 2)
	val employeThree = Employee1("John", 2)

//	println(employeOne === employeTwo)
//	println(employeTwo === employeThree)
//	println(employeOne.equals(employeTwo))
//	println(employeTwo.equals(employeThree))

	println(employeOne)

	val numerator = 10.99
	val denominator = 20.00
	println("Division is ${numerator/denominator}")
}

class Employee1(var name: String, val id: Int) {

	override fun equals(obj: Any?): Boolean {
		if (obj is Employee1){
			return name == obj.name && id == obj.id
		}

		return false
	}

	override fun toString(): String {
		return "Employee(name=$name, id=$id)"
	}


}
