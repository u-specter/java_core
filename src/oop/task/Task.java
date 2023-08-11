package oop.task;

public class Task {
    public static void main(String[] args) {
        Defender defender = new Defender(true);
        Secretary secretary = new Secretary(false);
        AccountingManager accountingManager = new AccountingManager(true);

        defender.getSalary();
        secretary.getSalary();
        secretary.drinkCoffee();
        accountingManager.getSalary();
    }
}
