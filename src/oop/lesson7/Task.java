package oop.lesson7;

import oop.lesson7.book.Book;

public class Task {
    public static void main(String[] args) {
        Book book = new Book("Atomic", "James", 340, false);
        book.printCountRows();
        book.printCountOnPage(12);
        book.printInto();
    }



}
