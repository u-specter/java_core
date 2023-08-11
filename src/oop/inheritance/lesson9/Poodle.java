package oop.inheritance.lesson9;

public class Poodle extends Dog{
    public Poodle(){
        super(28);
    }
    public void run(){
        System.out.println("Dog runs slow");
    }

    @Override
    public void breath() {
        System.out.println("Poodle breath");
    }
}
