package classwork.projects.library;

public class Test {

    public static void main(String[] args) {
        Book book1 = new Book(1,"The Great Gatsby","Fitzgerald");
        Book book2 = new Book(2,"War and peace","Leo Tolstoy");
        Book book3 = new Book(2,"The Witcher","Andrzej Sapkowski");


        Student student1 = new Student(1,"Sam");
        Student student2 = new Student(2,"Bob");
        Student student3 = new Student(3,"Martin");
        Student student4 = new Student(4,"Adam");
        Student student5 = new Student(5,"Mark");


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

        System.out.println();
        library.lendBook(student1,book1);
        library.lendBook(student2,book2);
        library.lendBook(teacher1,book3);

        library.acceptBook(student1,book1);
        library.lendBook(student4,book2);

        System.out.println();
        subject1.showAllStudents();
        System.out.println();
        subject2.showAllStudents();

        System.out.println();
        teacher1.display();
        System.out.println();
        teacher2.display();
    }
}
