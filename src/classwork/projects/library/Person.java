package classwork.projects.library;

import java.util.ArrayList;

public class Person {

    private String name;
    private Book lastBorrowedBook;
    private ArrayList<Book> borrowedBooks;

    public Person(String name) {
        this.borrowedBooks = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String firstLetter = name.split("")[0];
        if(firstLetter.equals(firstLetter.toUpperCase())) {
            this.name = name;
        } else {
            System.out.println("First letter couldn't be lower");
        }
    }

    public Book getLastBorrowedBook() {
        return lastBorrowedBook;
    }

    public void setLastBorrowedBook(Book lastBorrowedBook) {
        this.lastBorrowedBook = lastBorrowedBook;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void addBorrowedBook(Book borrowedBook) {
        borrowedBooks.add(borrowedBook);
    }

    public void removeBorrowedBook(Book borrowedBook) {
        borrowedBooks.remove(borrowedBook);
    }

    public void showBorrowedBooks() {
        System.out.println("Borrowed books of " + name + ":");
        borrowedBooks.forEach(Book::display);
    }

    // Method to display book details
    public void display() {
        System.out.println("Person: " + name);
    }
}
