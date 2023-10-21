package classwork.projects.library;

public class Test {

    public static void main(String[] args) {
        Book book = new Book(1,"The Great Gatsby","Fitzgerald");
        Student student = new Student(1,"Ansar");
        Library library = new Library();
        library.addBook(book);

        library.lendBook(student,book);
        library.lendBook(student,book);
        student.display();
        library.acceptBook(student,book);
        student.display();
    }
}
