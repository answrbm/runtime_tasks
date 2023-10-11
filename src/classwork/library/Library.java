package classwork.library;

public class Library {

    private Book availableBook;
    private boolean isBorrowed;

    public Library(Book availableBook) {
        this.availableBook = availableBook;
    }

    // Method to lend book for a student
    public void lendBook(Student student) {
        if(isBorrowed) {
            System.out.println("Book has already been borrowed");
        } else {
            student.setBorrowedBook(availableBook);
            isBorrowed = true;
            System.out.println("Book has been borrowed by "+ student.getName());
        }
    }

    // Method to accept returned book
    public void acceptBook(Student student) {
        isBorrowed = false;
        System.out.println("Book has been returned");
        student.setBorrowedBook(null);
    }
}
