package oop.lesson7;

import java.util.Arrays;

public class Dog {
    private String name = "Misha";
    private int weight = 60;
    private String owner = "Umidjon";
    {
        System.out.println("Dog created!");
    }

    public Dog(String name, int weight, String owner) {
        if(weight < 1){
            this.weight = 5;
        } else {
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }

    public void setWeight(int newWeight) {
        if (newWeight < 1) {
            this.weight = 5;
        } else {
            this.weight = newWeight;
        }
    }
    public void feed(String giver, String ...product){
        System.out.printf("%s give Dog to eat: %s\n", giver, Arrays.toString(product));
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
