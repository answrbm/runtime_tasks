package classwork.university;

public class Teacher {

    private int id;
    private String name;
    private Subject subject;

    public Teacher(int id, String name, Subject subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    // Method to display teacher details
    public void display() {
        System.out.println("Teacher: " + name + " | teacher id: " + id);
    }
}
