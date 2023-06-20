package com.codeclan.homework;

import java.util.ArrayList;

public class Borrower {
    private String name;


private ArrayList<Book>borrowersCollection;

public Borrower(String name){
    this.name = name;
    this.borrowersCollection = new ArrayList<>();
}


    public String getName() {
        return name;
    }

    public int collectionCount() {
        return borrowersCollection.size();
    }

    public void takeBookFromLib(Library library) {
        Book book = library.removeBook();
        borrowersCollection.add(book);
    }
//    public void addBook(Book newBook){
//    this.borrowersCollection.add(newBook);
//    }


    public Book removeBook() {
    return this.borrowersCollection.remove(0);
    }

    public void replaceBook(Borrower borrower){
    borrower.removeBook();
    }

}


