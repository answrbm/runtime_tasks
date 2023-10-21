package classwork.projects.library;

import classwork.projects.university.Subject;

public class Teacher extends Person {

    private int teacherId;
    private String name;
    private Subject subject;

    public Teacher(int teacherId, String name, Subject subject) {
        super(teacherId, name);
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public void display() {
        System.out.println("Teacher data:");
        super.display();
    }
}
