package oop.lesson8;

public class Car {
    private String brand;
    public static int countCars = 0;
    public final static String BMW_INFO = "BMW";
    public final static String AUDI_INFO = "AUDI";
    public final static String KIA_INFO = "KIA";


    public final static String[] BRAND_DESCRIPTION = new String[3];

    static {
        BRAND_DESCRIPTION[0] = BMW_INFO;
        BRAND_DESCRIPTION[1] = AUDI_INFO;
        BRAND_DESCRIPTION[2] = KIA_INFO;

    }
    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }

    public int getCountCars() {
        return countCars;
    }

    public static void printBrands() {
        System.out.println("There are cars: ");
    }

}
