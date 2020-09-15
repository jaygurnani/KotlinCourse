package academy.learnprogramming.inheritance

import java.time.Year

fun main(args: Array<String>) {
	println(CompanyCommunications.getTagLine())
	println(CompanyCommunications.getCopyRightLine())
	println(SomeClass.accessPrivateVar())

	val someClass1 = SomeClass.justAssign("testing")
	val someClass2 = SomeClass.upperOrLowerCases("testing", false)

	// To access the someClass members, use the member variable
	println(someClass1.someString)
	println(someClass2.someString)

	var thisIsMutable = 45

	wantSomeInterface(object : SomeInterface {
		override fun mustImplement(num: Int) : String {
			thisIsMutable++
			return "This is from mustImplement ${num * 200}"
		}
	})

	println(thisIsMutable)
	println(Department.ACCOUNTING.getDepartmentInfo())
}

enum class Department(val fullname: String, val numEmployees: Int) {
	HR("HR", 5), IT("IT", 10), ACCOUNTING("Accounting", 3), SALES("Sales", 20);

	fun getDepartmentInfo() = "The $fullname deparmtnet has $numEmployees"
}

fun topLevel() = "top level function"

object CompanyCommunications  {
	val currentYear = Year.now().value

	fun getTagLine() = "Company rocks!"
	fun getCopyRightLine() = "Copyright \u00A9 $currentYear"
}

class SomeClass private constructor(val someString: String) {

	companion object {
		private var privateVar = 6

		fun accessPrivateVar(): String {
			return "PrivateVar = $privateVar"
		}

		fun justAssign(str: String) = SomeClass(str)
		fun upperOrLowerCases(str: String, lowercase: Boolean) : SomeClass {
			if (lowercase) {
				return SomeClass(str.toLowerCase())
			} else {
				return SomeClass(str.toUpperCase())
			}
		}
	}
}

fun String.upperFirstAndLast() : String {
	return this.toUpperCase()
}

interface SomeInterface {
	fun mustImplement(num: Int): String
}

fun wantSomeInterface(si: SomeInterface) {
	println("printing from: ${si.mustImplement(22)}")
}