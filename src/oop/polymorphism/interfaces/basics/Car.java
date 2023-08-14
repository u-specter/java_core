package oop.polymorphism.interfaces.basics;

public class Car implements Moveable{
    public void move() {
        System.out.println("Car drive");
    }

    @Override
    public void back() {
        System.out.println("Car turn back");
    }
}
