package oop.polymorphism.interfaces.dependency_inversion;

import oop.inheritance.lesson9.Shepherd;

public class DogZoo {
    private Dog dog1;
    private Dog dog2;


    public DogZoo(Dog dog1, Dog dog2) {
        System.out.println("Constructor for any dog");
        this.dog1 = dog1;
        this.dog2 = dog2;
    }

    public DogZoo(Poodle poodle, Shepherd shepherd){
        System.out.println("Coonstructor for poodle and shephard");
        this.dog1 = poodle;
//        this.dog2 = shepherd;
    }


}
