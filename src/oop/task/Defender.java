package oop.task;

public class Defender extends Human {
    public Defender(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Defender gets 150$");
    }
}
