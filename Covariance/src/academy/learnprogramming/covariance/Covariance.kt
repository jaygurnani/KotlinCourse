package academy.learnprogramming.covariance

fun main(args: Array<String>) {
	val shortList: List<Short> = listOf(1,2,3,4,5)
	convertToInt(shortList)
}

fun convertToInt (collection: List<Number>) {
	for (num in collection) {
		println("${num.toInt()}")
	}

}

fun tendGarden(roseGarden: Garden<Rose>) {
	waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>){

}

open class Flower {

}

class Rose: Flower() {

}

// Garden class is invariant, thus the error occurs when you try to use the subclass
// TO make it covarient, use "<out T: Flower>
class Garden<out T: Flower>(val something: T) {

	val flowers: List<T> = listOf()
	fun pickFlower(i: Int): T = flowers[i]


}