package classwork.projects.library;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Book book1 = new Book(1,"The Great Gatsby","Fitzgerald");
        Book book2 = new Book(2,"War and peace","Leo Tolstoy");
        Book book3 = new Book(3,"The Witcher","Andrzej Sapkowski");
        Book book4 = new Book(4,"Book4","Author4");
        Book book5 = new Book(5,"Book5","Author5");
        Book book6 = new Book(6,"Book6","Author6");
        Book book7 = new Book(7,"Book7","Author7");
        Book book8 = new Book(8,"Book8","Author8");
        Book book9 = new Book(9,"Book9","Author9");
        Book book10 = new Book(10,"Book10","Author10");
        Book book11 = new Book(11,"Book11","Author11");


        Student student1 = new Student(1,"Sam",StudyYear.FIRST);
        Student student2 = new Student(2,"Bob",StudyYear.FIRST);
        Student student3 = new Student(3,"Martin",StudyYear.FIRST);
        Student student4 = new Student(4,"Adam",StudyYear.FIRST);
        Student student5 = new Student(5,"Mark",StudyYear.FIRST);


        Teacher teacher1 = new Teacher(1,"Teacher1");
        Teacher teacher2 = new Teacher(2,"Teacher2");


        Subject subject1 = new Subject("Math",teacher1);
        Subject subject2 = new Subject("Computer Science",teacher2);
        subject1.addStudent(student1);
        subject1.addStudent(student2);
        subject1.addStudent(student3);
        subject1.addStudent(student4);
        subject1.addStudent(student5);

        subject2.addStudent(student1);
        subject2.addStudent(student2);
        subject2.addStudent(student3);
        subject2.addStudent(student4);
        subject2.addStudent(student5);

        System.out.println();
        subject1.showAllStudents();
        System.out.println();
        subject2.showAllStudents();

        System.out.println();
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        library.addBook(book11);

        System.out.println();
        library.lendBook(student1,book1);
        library.lendBook(student1,book2);
        library.lendBook(student2,book3);
        library.lendBook(student2,book4);
        library.lendBook(student3,book5);
        library.lendBook(student3,book6);
        library.lendBook(student4,book7);
        library.lendBook(student4,book8);
        library.lendBook(teacher1,book9);
        library.lendBook(teacher2,book10);

        student1.showBorrowedBooks();

        library.acceptBook(student1,book1);
        library.lendBook(student4,book2);

        student1.showBorrowedBooks();

        System.out.println();
        subject1.showAllStudents();
        System.out.println();
        subject2.showAllStudents();

        System.out.println();
        teacher1.display();
        System.out.println();
        teacher2.display();

        library.showAllBooks();
        library.showAvailableBooks();

        System.out.println("_____________");

        library.showBorrowerStudentsByStudyYear(StudyYear.FIRST);
    }
}
