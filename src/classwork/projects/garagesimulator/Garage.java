package classwork.projects.garagesimulator;

import classwork.projects.garagesimulator.vehicles.Vehicle;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle> vehicles;

    public Garage() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public void displayVehicles() {
        vehicles.forEach(Vehicle::display);
    }
}
