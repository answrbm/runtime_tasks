package lesson11.classwork.library;

public class Test {
    public static void main(String[] args) {
        Library library = new Library(10);

        Book book = new Book("Book1","Author1",1,1900);
        Book book1 = new Book("Book1","Author1",1,1900);
        Book book2 = new Book("Book2","Author2",2,1902);
        Book book3 = new Book("Book3","Author3",3,1903);

        library.addBook(book);
        library.addBook(book1);

        library.getBooks();
        System.out.println(library.findBookByIsbn(2));
    }
}
