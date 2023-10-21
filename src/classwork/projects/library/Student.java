package classwork.projects.library;

public class Student {

    private int studentId; // Номер зачетки
    private String name;
    private Book borrowedBook; // Every student can take only one book
    private Book lastBorrowedBook;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
        setLastBorrowedBook(borrowedBook);
    }

    public void setLastBorrowedBook(Book lastBorrowedBook) {
        this.lastBorrowedBook = lastBorrowedBook;
    }

    // Method to display book details
    public void display() {
        System.out.println("Student: " + name + " | student id: " + studentId + " | book: " + borrowedBook.getTitle());
    }
}
