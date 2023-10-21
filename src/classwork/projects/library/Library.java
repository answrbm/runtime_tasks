package classwork.projects.library;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> availableBooks;

    public Library() {
        this.availableBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        availableBooks.add(book);
        System.out.println("New book was added to the library");
    }

    // Method to lend book for a student
    public void lendBook(Person person, Book book) {
        if(!book.isAvailable()) {
            System.out.println("Book has already been borrowed");
        } else {
            person.setBorrowedBook(book);
            book.setAvailable(false);
            System.out.println("Book has been borrowed by "+ person.getName());
        }
    }

    // Method to accept returned book
    public void acceptBook(Person person, Book book) {
        book.setAvailable(true);
        System.out.println("Book has been returned");
        person.setBorrowedBook(null);
    }
}
