package oop.lesson8;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Car audi = new Car("bmw");
        Car bmw = new Car("bmw");
        System.out.println("Amount cars: " + Car.countCars);

        Car.printBrands();
        System.out.println(Car.BMW_INFO);

        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTION));
    }
}
