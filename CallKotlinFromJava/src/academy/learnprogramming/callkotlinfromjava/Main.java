package academy.learnprogramming.callkotlinfromjava;

import academy.learnprogramming.kotlincode.Car;
import academy.learnprogramming.kotlincode.SingletonObj;
import academy.learnprogramming.kotlincode.StaticCar;

import static academy.learnprogramming.kotlincode.StaticCar.topLevel;

public class Main {

    public static void main(String[] args) {
        topLevel();

        StaticCar.print("print this java string");

        Car car = new Car ("blue", "BMW", 2011, true);
        System.out.println(car.model);

        System.out.println(Car.carComp());

        SingletonObj.doSomething();

        car.defaultArgs("Test");
    }
}
