package classwork.projects.library;

public class Student extends Person {

    private final int studentId; // Номер зачетки
    private StudyYear studyYear;

    public Student(int studentId, String name, StudyYear studyYear) {
        super(name);
        this.studentId = studentId;
        this.studyYear = studyYear;
    }

    public int getStudentId() {
        return studentId;
    }

    public StudyYear getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(StudyYear studyYear) {
        this.studyYear = studyYear;
    }

    @Override
    public void display() {
        System.out.print("Student id: " + studentId + " Study year: " + studyYear + " ");
        super.display();
    }
}
