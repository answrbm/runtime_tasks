package classwork.projects.library;

public class Person {

    private String name;
    private Book lastBorrowedBook;
    private Book borrowedBook;

    public Person(String name) {
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

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    // Method to display book details
    public void display() {
        String title;
        if(borrowedBook == null)
            title = "no book";
        else
            title = borrowedBook.getTitle();
        System.out.println("Person: " + name + " | book: " + title);
    }
}
