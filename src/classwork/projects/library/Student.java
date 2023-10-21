package classwork.projects.library;

public class Student extends Person {

    private int studentId; // Номер зачетки
    private String name;

    public Student(int studentId, String name) {
        super(studentId,name);
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Student data:");
        super.display();
    }
}
