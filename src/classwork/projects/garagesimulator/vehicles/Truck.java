package classwork.projects.garagesimulator.vehicles;

import classwork.projects.garagesimulator.vehicles.Vehicle;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(String name, double speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
}
