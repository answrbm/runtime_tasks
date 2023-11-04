package classwork.projects.library;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

public class Library {

    private ArrayList<Book> availableBooks;
    private ArrayList<Person> peopleWithBooks; // The list of people who borrowed a book

    public Library() {
        this.availableBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        availableBooks.add(book);
        System.out.println("New book was added to the library");
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

    public void getStudentById(int studentId) {
        Optional<Person> foundPerson = peopleWithBooks.stream().filter(person -> person instanceof Student &&
                        ((Student) person).getStudentId() == studentId).findAny();
        if(foundPerson.isPresent())
            foundPerson.get().display();
        else
            System.out.println("Student not found");
    }

    public void getTeacherById(int teacherId) {
        Optional<Person> foundPerson = peopleWithBooks.stream().filter(person -> person instanceof Teacher &&
                ((Teacher) person).getTeacherId() == teacherId).findAny();
        if(foundPerson.isPresent())
            foundPerson.get().display();
        else
            System.out.println("Teacher not found");
    }
}
