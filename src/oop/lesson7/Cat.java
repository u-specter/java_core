package oop.lesson7;

import java.util.Arrays;

public class Cat {
    public String color;
    double weight;
    public String ownerName;

    public Cat(String colorName, double weightCat, String owner){
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }

    public void destroySofa(String sofaOwner){
        System.out.printf("Cat destroy %s sofa", sofaOwner);
    }

    public String hunt(boolean isDay, boolean success) {
        if(success) {
            if (isDay){
                return "Jerry";
            }
            return "Tom";
        }
        return "Nothing";
    }

    public void hunt(String timesOfDay){
        if(timesOfDay.equals("Morning")){
            System.out.println("Jerry");
        } else {
            System.out.println("Tom");
        }
    }

    public void feed(String giver, String ...product){
        System.out.printf(" %s give Cat to eat: %s\n",giver, Arrays.toString(product));
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
