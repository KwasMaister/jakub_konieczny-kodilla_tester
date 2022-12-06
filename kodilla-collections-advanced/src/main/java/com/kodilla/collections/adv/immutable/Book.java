package com.kodilla.collections.adv.immutable;

public class Book {

    /*
    protected jest to modyfikator dostepu który oznacza ze zmienne sa traktowane jako pola prywatne z zastrzeżeniem ze
    dostęp do nich mogą uzyskac również klasy dziedziczące z klasy Book oraz inne klasy w obrębie tego samego pakietu
     */
    protected String author;
    protected String title;

    public Book (String author, String title){
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
