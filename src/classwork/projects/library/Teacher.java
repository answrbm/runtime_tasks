package classwork.projects.library;

import classwork.projects.university.Subject;

public class Teacher extends Person {

    private final int teacherId; // пропуск

    public Teacher(int teacherId, String name) {
        super(name);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public void display() {
        System.out.print("Teacher id: " + teacherId + " ");
        super.display();
    }
}
