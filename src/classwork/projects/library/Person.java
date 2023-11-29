package classwork.projects.library;

import java.util.ArrayList;

public class Person {

    private String name;
    private Book lastBorrowedBook;
    private ArrayList<Book> borrowedBooks;
    public static final int BOOK_CAPACITY = 5;
    private static int bookCounter = 0;

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

    public void addBorrowedBooks(ArrayList<Book> borrowedBooks) {
        if(bookCounter + borrowedBooks.size() < BOOK_CAPACITY) {
            bookCounter += borrowedBooks.size();
            this.borrowedBooks.addAll(borrowedBooks);
        } else {
            System.out.println(name + " can take only " + BOOK_CAPACITY + " books!");
        }
    }

    public void addBorrowedBook(Book borrowedBook) {
        if(bookCounter < BOOK_CAPACITY) {
            bookCounter++;
            borrowedBooks.add(borrowedBook);
        } else {
            System.out.println(name + " can take only " + BOOK_CAPACITY + " books!");
        }
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
