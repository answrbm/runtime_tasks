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
    public void lendBook(Student student, Book book) {
        if(!book.isAvailable()) {
            System.out.println("Book has already been borrowed");
        } else {
            student.setBorrowedBook(book);
            book.setAvailable(false);
            System.out.println("Book has been borrowed by "+ student.getName());
        }
    }

    // Method to accept returned book
    public void acceptBook(Student student, Book book) {
        book.setAvailable(true);
        System.out.println("Book has been returned");
        student.setBorrowedBook(null);
    }
}
