package oop.inheritance.lesson9;

public class Runner {
    public static void main(String[] args) {


        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        System.out.println(poodle.countTeath);

        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        System.out.println(shepherd.countTeath);



    }
}
