package oop.lesson7.book;

public class Book {
    String name;
    String author;
    int pages;
    boolean isNonFiction;

    public Book(String name, String author, int pages, boolean isNonFiction) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.isNonFiction = isNonFiction;
    }

    public void printCountRows(){
        System.out.println("Rows quantity: " + this.pages * 40);
    }

    public void printCountOnPage(int countRowsOnPage){
        System.out.println("Rows quantity: " + this.pages * countRowsOnPage);
    }

    public void printInto(){
        System.out.printf("%s by %s - %s", this.name, this.author, this.isNonFiction ? "Fiction" : "Non fiction");
    }

}
