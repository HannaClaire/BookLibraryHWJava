package com.codeclan.homework;


import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(ArrayList <Book> inputBooks) {
        this.books = inputBooks;
        this.capacity = 5;
    }


    public int bookCount(){
        return books.size();
    }

    public void addBook(Book newBook){
        this.books.add(newBook);

    }

    public void checkStockLevel() {
        if (this.books.size() < this.capacity) {
            addBook(new Book("Guide to not giving a flipflop", "Mark Manson", "Self-Help"));
        }

    }


    public Book removeBook() {
        return this.books.remove(0);
    }


}


