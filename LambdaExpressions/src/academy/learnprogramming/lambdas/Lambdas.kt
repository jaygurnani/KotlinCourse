package academy.learnprogramming.lambdas

fun main(args: Array<String>) {

  val employees = listOf(Employee("John", "Smith", 2012),
      Employee("Jane", "Wilson", 2015), Employee("Mary", "Johnson", 2010),
      Employee("Mike", "Jones", 2002))

    println(employees.minByOrNull(Employee::startYear))
    //println(employees.minByOrNull { it.startYear })
    //println(employees.minByOrNull { e -> e.startYear })

    var num = 10
    run(::topLevel)
}

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach{
        println(it.firstName)
        println(num)
    }
}

fun topLevel() = println("I am a top level function")

data class Employee(val firstName: String, val lastName: String, val startYear: Int)