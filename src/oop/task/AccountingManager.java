package oop.task;

public class AccountingManager extends OfficeWorker{

    public AccountingManager(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Account manager get 300$");
    }
}
