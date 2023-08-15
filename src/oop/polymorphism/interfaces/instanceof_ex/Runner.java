package oop.polymorphism.interfaces.instanceof_ex;

public class Runner {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal[] zoo = {cat, dog};
        for (Animal animal : zoo) {
            if (animal instanceof Cat){ // instanceof
                // first method
                Cat cat1 = (Cat) animal;
                cat1.sayMeow();

                //second method
                ((Cat) animal).sayMeow();


            }
        }


    }
}
