package classwork.projects.garagesimulator;

import classwork.projects.garagesimulator.models.Vehicle;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(String name, double speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
    @Override
    public void move() {
        System.out.println("Truck is moving");
    }
}
