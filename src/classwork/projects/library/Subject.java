package classwork.projects.library;

import java.util.ArrayList;

public class Subject {

    private final String subjectName;
    private final Teacher teacher;
    private final ArrayList<Student> students; // студенты обучающиеся на курсе

    public Subject(String subjectName, Teacher teacher) {
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void showAllStudents() {
        display();
        System.out.println("Students:");
        students.forEach(Student::display);
    }

    // Method to display subject details
    public void display() {
        System.out.println("Subject: " + subjectName + " | teacher: " + teacher.getName());
    }
}
