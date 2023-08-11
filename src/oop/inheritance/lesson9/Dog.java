package oop.inheritance.lesson9;

public abstract class Dog extends Alive {

    public final int countLegs = 4;
    public int countTeath;

    public Dog(int countTeeth){
        this.countTeath = countTeeth;
    }
    public void bark(){
        System.out.println("Dog barks");
    }

    public abstract void run();

}
