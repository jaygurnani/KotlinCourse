package academy.learnprogramming.usesitevarience

import javax.print.attribute.standard.Destination

fun main (args: Array<String>) {

    val cars1 = mutableListOf(Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()
    copyCars(cars1, cars2)

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()
    copyCars(fords1, fords2)

    copyCars(fords1, cars2)

    // If we can do the below we should be able to do the above
    val cars3: MutableList<Car> = mutableListOf(Ford(), Ford())

}

fun <T: Car> copyCars(source: MutableList<out T>, destination: MutableList<in T>) {
    for(car in source) {
        destination.add(car)
    }
}

open class Car {

}

class Toyota: Car() {

}

class Ford: Car() {

}