package oop.polymorphism.basics;

public interface Moveable {
    void move();

    default void back(){
        System.out.println("Go back");
    }
}
