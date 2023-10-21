package classwork.projects.library;

import classwork.projects.university.Subject;

public class Teacher {

    private int teacherId;
    private String name;

    private Book borrowedBook; // Every teacher can take only one book
    private Book lastBorrowedBook;
    private Subject subject;

    public Teacher(int teacherId, String name, Subject subject) {
        this.teacherId = teacherId;
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
        setLastBorrowedBook(borrowedBook);
    }

    public Book getLastBorrowedBook() {
        return borrowedBook;
    }

    public void setLastBorrowedBook(Book lastBorrowedBook) {
        this.lastBorrowedBook = lastBorrowedBook;
    }

    public Subject getSubject() {
        return subject;
    }

    // Method to display teacher details
    public void display() {
        System.out.println("Teacher: " + name + " | teacher id: " + teacherId);
    }
}
