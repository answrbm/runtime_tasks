package classwork.projects.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

    private final ArrayList<Book> availableBooks;
    private final ArrayList<Person> peopleWithBooks; // The list of people who borrowed a book
    public static final int LIBRARY_CAPACITY = 10;
    private static int bookCounter = 0;

    public Library() {
        this.peopleWithBooks = new ArrayList<>();
        this.availableBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        if(bookCounter < LIBRARY_CAPACITY) {
            bookCounter++;
            availableBooks.add(book);
            System.out.println("New book was added to the library");
        } else {
            System.out.println("No place for your book! Library capacity: " + LIBRARY_CAPACITY);
        }
    }

    //Method to add the list of books
    public void addBooks(Book[] books) {
        if(books.length + bookCounter < LIBRARY_CAPACITY) {
            availableBooks.addAll(List.of(books));
        } else {
            System.out.println("No place for your books! Library capacity: " + LIBRARY_CAPACITY);
        }
    }

    //Method to get the list of all books
    public void showAllBooks() {
        System.out.println("All books in library:");
        availableBooks.forEach(Book::display);
    }

    //Method to get the list of available books
    public void showAvailableBooks() {
        System.out.println("Available books in library:");
        availableBooks.stream().filter(Book::isAvailable).forEach(Book::display);
    }

    // Method to lend book
    public void lendBook(Person person, Book book) {
        if(!book.isAvailable()) {
            System.out.println("Book has already been borrowed");
        } else {
            person.setBorrowedBook(book);
            book.setAvailable(false);
            peopleWithBooks.add(person);
            System.out.println("Book has been borrowed by "+ person.getName());
        }
    }

    // Method to accept returned book
    public void acceptBook(Person person, Book book) {
        book.setAvailable(true);
        System.out.println("Book has been returned");
        peopleWithBooks.remove(person);
        person.setBorrowedBook(null);
    }

    //Method to get the list of people who borrowed a book
    public void getPeopleWithBooks() {
        peopleWithBooks.forEach(System.out::println);
    }

    //Method to find the person who borrowed a book by a book id
    public void getBorrowerByBookId(int bookId) {
        Optional<Person> foundPerson = peopleWithBooks
                .stream()
                .filter(person -> person.getBorrowedBook().getBookId() == bookId)
                .findAny();

        if(foundPerson.isPresent()) {
            Person person = foundPerson.get();
            System.out.println("Book has been borrowed by "+ person.getName());
        } else {
            System.out.println("No person with such book or book doesn't exist");
        }
    }

    //Method to find a student by id
    public void getStudentById(int studentId) {
        Optional<Person> foundPerson = peopleWithBooks.stream().filter(person -> person instanceof Student &&
                        ((Student) person).getStudentId() == studentId).findAny();
        if(foundPerson.isPresent())
            foundPerson.get().display();
        else
            System.out.println("Student not found");
    }

    //Method to find a teacher by id
    public void getTeacherById(int teacherId) {
        Optional<Person> foundPerson = peopleWithBooks.stream().filter(person -> person instanceof Teacher &&
                ((Teacher) person).getTeacherId() == teacherId).findAny();
        if(foundPerson.isPresent())
            foundPerson.get().display();
        else
            System.out.println("Teacher not found");
    }
}
