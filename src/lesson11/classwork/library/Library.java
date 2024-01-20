package lesson11.classwork.library;

import java.util.Arrays;

public class Library {

    private Book[] books;
    private int counter;

    public Library(int capacity) {
        this.books = new Book[capacity];
    }

    public void addBook(Book book) {
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                books[i] = book;
                break;
            } else {
                if(books[i].equals(book))
                    System.out.println("There is a book with such isbn");
                break;
            }
        }
    }

    public Book findBookByIsbn(int isbn) {
        Book foundBook = null;
        for(int i = 0; i < books.length; i++) {
            if(books[i] != null) {
                if(books[i].getIsbn() == isbn)
                    foundBook = books[i];
                break;
            }
        }
        return foundBook;
    }

    public void removeBook(Book book) {
        for(int i = 0; i < books.length; i++) {
            if(books[i].equals(book)) {
                books[i] = null;
            }
        }
    }

    public void getBooks() {
        System.out.println(Arrays.toString(books));
    }
}
