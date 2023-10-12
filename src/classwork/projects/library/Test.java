package classwork.projects.library;

public class Test {

    public static void main(String[] args) {
        Book book = new Book(1,"The Great Gatsby","Fitzgerald");
        Student student = new Student(1,"Ansar");
        Library library = new Library(book);

        library.lendBook(student);
        library.lendBook(student);
        System.out.println(student);
        library.acceptBook(student);
        System.out.println(student);
    }
}
