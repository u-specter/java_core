package oop.lesson7;

import oop.lesson7.zoo.Zoo;

public class Runner {
    public static void main(String[] args) {

        Cat cat = new Cat("White", 8, "Umidjon");
//        System.out. println(cat);
//        cat.destroySofa("Umidjon");
//        String animal = cat.hunt(false, true);
//        System.out.println(animal);
//        cat.hunt("Morning");
//        cat.feed("Meat");

        Dog dog = new Dog("Misha", 60, "Umidjon");

        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();
        System.out.println(dog);
    }
}
