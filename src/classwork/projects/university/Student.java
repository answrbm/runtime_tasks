package classwork.projects.university;

import java.util.ArrayList;
import java.util.Optional;

public class Student {

    private int studentId; // Номер зачетки
    private String name;
    private ArrayList<Subject> subjects; // Student can have only 3 subjects

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.subjects = new ArrayList<>(3);
    }

    public String getName() {
        return name;
    }

    public void addSubject(Subject subject) {
        if (subjects.size() != 3) {
            Optional<Subject> foundSubject = subjects.stream().filter(sbj -> sbj.getSubjectId() == subject.getSubjectId()).findAny();
            if(foundSubject.isPresent()) {
                System.out.println("Student already assigned for the course");
            } else {
                subjects.add(subject);
                System.out.println("Subject was added");
            }
        } else {
            System.out.println("Student had already chosen 3 subjects");
        }
    }

    public void removeSubject(int subjectId) {
        Optional<Subject> foundSubject = subjects.stream().filter(sbj -> sbj.getSubjectId() == subjectId).findAny();
        if(foundSubject.isPresent()) {
            subjects.remove(foundSubject.get());
            System.out.println("Subject was removed");
        } else {
            System.out.println("No such subject");
        }
    }

    public void showSubjects() {
        subjects.forEach(System.out::println);
    }

    // Method to display subjects
    public void display() {
        System.out.println("Student: " + name + " | student id: " + studentId);
        if(!subjects.isEmpty()) {
            for(Subject subject : subjects)
                System.out.println(subject);
        }
    }
}
