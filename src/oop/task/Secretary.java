package oop.task;

public class Secretary extends OfficeWorker{
    public Secretary(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Secretary get 120$");
    }
}
