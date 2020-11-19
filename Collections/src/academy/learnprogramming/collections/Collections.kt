package academy.learnprogramming.collections

fun main(args: Array<String>) {
    val string = listOf("spring", "summer", "fall", "winter")
    println(string.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    val arrayList = arrayListOf(1,2,3)
    println(arrayList.javaClass)

    val mutableList = mutableListOf(1,2,3)
    println(mutableList.javaClass)

    val array = arrayOf("black", "white", "green")
    val colorList = array.toList()
    println(colorList)

    val ints = intArrayOf(1,2,3)
    println(ints.toList())
}