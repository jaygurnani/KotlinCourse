package academy.learnprogramming.contravariance

fun main (args: Array<String>) {

    val flowerTender = object: FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("I am pruning a ${flower.name}!")
    }

//    val roseTender = object: FlowerCare<Rose> {
//        override fun prune(flower: Rose) = println("I am pruning a rose!")
//    }

    val roseGarden = Garden<Rose>(listOf(Rose(), Rose()), flowerTender)
    roseGarden.tendFlower(0)

//    val daffodilTender = object: FlowerCare<Daffodil> {
//        override fun prune(flower: Daffodil) = println("I am pruning a daffodil!")
//    }

    val daffodilGarden = Garden<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(1)

}

class Garden<T: Flower> (val flowers: List<T>, val flowerCare: FlowerCare<T>) {

    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

open class Flower(val name: String) {

}

class Rose: Flower("Rose") {

}

class Daffodil: Flower("Daffodil") {

}

interface FlowerCare<in T> {
    fun prune(flower: T)
}