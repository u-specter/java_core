package oop.lesson7.practice;

public class Practice {
    public static void main(String[] args) {
        Car umidjonCar = new Car("UmidjonCar");

        Car superCar = new Car("SuperCar", 400);

        Garage garage = new Garage();
        garage.setCar1(umidjonCar);
        garage.setCar2(superCar);
        garage.getInfoAboutCars();

    }
}
