package classwork.projects.garagesimulator.vehicles;

public class Boat extends Vehicle {

    public Boat(String name, double speed) {
        super(name, speed);
    }

    public void anchor() {
        System.out.println("Dropping the anchor");
    }

    @Override
    public void move() {
        System.out.println(name + " is floating");
    }
}
