package lesson10.interfaces;

public class Student implements MathStudent, ComputerScienceStudent {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void doComputerScience() {
        System.out.println("Student " + name + " learning computer science");
    }

    @Override
    public void doMath() {
        System.out.println("Student " + name + " learning math");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
