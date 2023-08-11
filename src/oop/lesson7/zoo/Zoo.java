package oop.lesson7.zoo;


import oop.lesson7.Cat;
import oop.lesson7.Dog;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Cat cat, Dog dog) {
//        if (cat == null){
//            this.cat = new Cat();
//        }
        this.cat = cat;
        this.dog = dog;
    }

    public void feed(){
        cat.feed("Muzia", "Fish");
        dog.feed("Reks",  "meat");
    }
}
