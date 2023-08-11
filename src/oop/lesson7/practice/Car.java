package oop.lesson7.practice;

public class Car {
    private String brand;

    private int maxSpeed = 220;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int maxSpped) {
        this.brand = brand;
        this.maxSpeed = maxSpped;
    }

    public void investigateSpeed100(){
        double speed = 110d / (this.maxSpeed / 20d);
        System.out.printf("Acceleration speed to 100km/h: %s\n", speed);
    }

    public String getBrand() {
        return brand;
    }
}
