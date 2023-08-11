package oop.lesson8.task;

public class Restaurant {
    private static int sausageCount = 0;
    private static int breadCount = 0;

    public void cookHotDog(){
        if(sausageCount > 0 && breadCount > 1){
            sausageCount--;
            breadCount -= 2;
            System.out.println("Hot-dog is ready!");
        } else {
            System.out.println("There is not ingredient");
        }
    }

    public void  addProducts() {
        sausageCount += 100;
        breadCount += 200;
        System.out.println("Restaurant accepted");
    }
}
