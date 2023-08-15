package oop.polymorphism.interfaces.interface_marker;

import oop.polymorphism.interfaces.instanceof_ex.Cat;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();
        if (bird instanceof Alive){
            System.out.println("Bird alive");
        }
        if (airplane instanceof Alive){
            System.out.println("Airplane alive");
        } else {
            System.out.println("Airplane not alive");
        }
    }
}
