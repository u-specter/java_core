package oop.inheritance.lesson9;

public class Shepherd extends Dog{

    public Shepherd() {
        super(27);
    }
    @Override
    public void run() {
        System.out.println("Shepherd run fast");
    }

    @Override
    public void breath() {
        System.out.println("Shepherd breathe");
    }
}
