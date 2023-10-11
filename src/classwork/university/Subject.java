package classwork.university;

public class Subject {

    private int subjectId;
    private String subjectName;
    private Teacher teacher;

    public Subject(int subjectId, String subjectName, Teacher teacher) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.teacher = teacher;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    // Method to display subject details
    public void display() {
        System.out.println("Subject: " + subjectName + " | subject id: " + subjectId + " | teacher: " + teacher.getName());
    }
}
