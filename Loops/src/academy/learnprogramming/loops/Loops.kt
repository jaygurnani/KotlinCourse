package academy.learnprogramming.loops

fun main(args: Array<String>) {
    val range = 1..5
//    for (i in range){
//        println(i)
//    }


    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"

//    println(3 in range)
//    println('q' in charRange)
//    println("CCC" in stringRange)

    val stepRange = 1..15
    val step = stepRange.step(3)

//    for (n in step){
//        println(n)
//    }

    val hello = "Hello"
//    for (m in hello){
//        println(m)
//    }

    // Another way to do step
//    for (num in 1..20 step 4) {
//        println(num)
//    }

    // Backward step with combined functions
//    for (i in 20 downTo 15 step 5) {
//        println(i)
//    }
//
//    val seasons = arrayOf("spring", "summer", "winter", "fall")
//    for (season in seasons){
//        println(season)
//    }
//
//    for(index in seasons.indices) {
//        println(index)
//    }
//
//    seasons.forEachIndexed { index, value -> println("$value $index")}
//
//    val str = "Hello"
//    println('e' in str)
//    println('e' !in str)


    for (i in 1..3){
        println("i = $i")
        loop@ for(j in 1..4) {
            println("j = $j")
                for(k in 5..10) {
                    println("k = $k")
                    if (k == 7) {
                        break@loop
                        //continue@loop
                    }
                }
            }
        }
    }