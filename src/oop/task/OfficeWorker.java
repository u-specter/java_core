package oop.task;

public abstract class OfficeWorker extends Human{
    public OfficeWorker(boolean isMan) {
        super(isMan);
    }

    public void drinkCoffee() {
        System.out.println("Office worker drinks coffee");
    }

}
