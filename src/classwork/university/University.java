package classwork.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class University {

    private List<Subject> courses;

    public University() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Subject subject) {
        courses.add(subject);
        System.out.println("Course was added");
    }

    public void removeCourse(int subjectId) {
        Optional<Subject> foundCourse = courses.stream().filter(course -> course.getSubjectId() == subjectId).findAny();
        if(foundCourse.isPresent()) {
            courses.remove(foundCourse.get());
            System.out.println("Course was removed");
        } else {
            System.out.println("No such course");
        }
    }

    // Method to sign student for a course
    public void signToCourse(Student student, Subject subject) {
        student.addSubject(subject);
        System.out.println("Student " + student.getName() + " was assigned to " + subject.getSubjectName());
    }

    // Method to sign out student from a course
    public void signOutFromCourse(Student student, Subject subject) {
        student.removeSubject(subject.getSubjectId());
        System.out.println("Student " + student.getName() + " signed out from " + subject.getSubjectName());
    }

}
