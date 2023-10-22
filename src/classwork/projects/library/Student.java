package classwork.projects.library;

public class Student extends Person {

    private int studentId; // Номер зачетки

    public Student(int studentId, String name) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public void display() {
        System.out.print("Student id: " + studentId + " ");
        super.display();
    }
}
