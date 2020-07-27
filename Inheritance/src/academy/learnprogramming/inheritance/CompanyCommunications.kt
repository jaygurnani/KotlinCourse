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
}

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
