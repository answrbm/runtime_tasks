package classwork.projects.garagesimulator;

import classwork.projects.garagesimulator.vehicles.Boat;
import classwork.projects.garagesimulator.vehicles.Car;
import classwork.projects.garagesimulator.vehicles.Truck;
import classwork.projects.garagesimulator.vehicles.Vehicle;

public class GarageManager {

    private Garage garage;
    private Car[] cars;
    private Boat[] boats;
    private Truck[] trucks;

    public GarageManager(Garage garage) {
        this.garage = garage;
    }

    public void manageVehiclesInGarage(Vehicle[] vehicles) {
        for(Vehicle vehicle : vehicles) {
            vehicle.move();
            garage.addVehicle(vehicle);
            if(vehicle instanceof Boat)
                System.out.println(vehicle.getName() + " was parked in port garage");
            else
                System.out.println(vehicle.getName() + " was parked in garage");

            System.out.println("Currently in garage:");
            garage.displayVehicles();
        }

        for(Vehicle vehicle : vehicles) {
            vehicle.move();
            garage.removeVehicle(vehicle);
            if(vehicle instanceof Boat)
                System.out.println(vehicle.getName() + " was moved out of garage");
            else
                System.out.println(vehicle.getName() + " was moved out of port garage");

            System.out.println("Currently in garage:");
            garage.displayVehicles();
        }
    }
}
