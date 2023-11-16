package classwork.projects.garagesimulator;

import classwork.projects.garagesimulator.models.Vehicle;

public class Boat extends Vehicle {

    public Boat(String name, double speed) {
        super(name, speed);
    }

    public void anchor() {
        System.out.println("Dropping the anchor");
    }

    @Override
    public void move() {
        System.out.println("Boat is moving");
    }
}
