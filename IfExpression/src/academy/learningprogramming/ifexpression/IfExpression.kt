package academy.learningprogramming.ifexpression

fun main(args: Array<String>) {

    val somecondition = 69 < 22
    val num = if (somecondition) 50 else 592


    val num2 = if (somecondition) {
        50
    }
    else {
        200
    }
    println(num2)
}