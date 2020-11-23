package academy.learnprogramming.lists

fun main(args: Array<String>) {

    var strings = listOf("spring", "summer", "summer", "fall", "winter")
    val colorList = listOf("black", "white", "red", "black", "red")

    println(strings.last())
    println(strings.asReversed())

    println(strings.getOrNull(5))

    val ints = listOf(1,2,3,4,5)
    println(ints.maxOrNull())

    println(colorList.zip(strings))

    val mergedList = listOf(colorList, strings)
    println(mergedList)

    val combinedList = colorList + strings
    println(combinedList)

    val noDuplicatesList = colorList.union(strings)
    println(noDuplicatesList)

    val noDupColours = colorList.distinct()
    println(noDupColours)
}