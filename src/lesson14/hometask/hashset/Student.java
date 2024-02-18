package lesson14.hometask.hashset;

import java.util.Objects;

public class Student {

    private String studentId;
    private String name;
    private String group;

    public Student(String studentId, String name, String group) {
        this.studentId = studentId;
        this.name = name;
        this.group = group;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public int hashCode() {
        return studentId != null ? studentId.hashCode() : 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;

        if(o == null || !getClass().equals(o.getClass()))
            return false;

        Student s = (Student) o;
        return studentId.equals(s.studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
