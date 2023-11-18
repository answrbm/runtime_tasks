package classwork.projects.garagesimulator.vehicles;

public class Vehicle {
    protected String name;
    protected double speed;

    public Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    public void display() {
        System.out.println("Vehicle: " + name + " speed: " + speed);
    }
}
