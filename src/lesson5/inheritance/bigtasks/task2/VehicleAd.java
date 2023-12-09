package lesson5.inheritance.bigtasks.task2;

import lesson5.inheritance.bigtasks.task2.vehicletype.body.VehicleTypeByBodyTypes;
import lesson5.inheritance.bigtasks.task2.vehicletype.fuel.VehicleTypeByFuelTypes;
import lesson5.inheritance.bigtasks.task2.vehicletype.purpose.VehicleTypeByPurpose;

public class VehicleAd {

    private String id;
    private String model;
    private VehicleTypeByPurpose vehicleTypeByPurpose;
    private VehicleTypeByBodyTypes vehicleTypeByBodyTypes;
    private VehicleTypeByFuelTypes vehicleTypeByFuelTypes;

    public VehicleAd(String id,
                     String model,
                     VehicleTypeByPurpose vehicleTypeByPurpose,
                     VehicleTypeByBodyTypes vehicleTypeByBodyTypes,
                     VehicleTypeByFuelTypes vehicleTypeByFuelTypes) {
        this.id = id;
        this.model = model;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
        this.vehicleTypeByBodyTypes = vehicleTypeByBodyTypes;
        this.vehicleTypeByFuelTypes = vehicleTypeByFuelTypes;
    }

    //for creating new Car
    public VehicleAd(String model) {
        this.model = model;
    }

    public VehicleTypeByPurpose getVehicleTypeByPurpose() {
        return vehicleTypeByPurpose;
    }

    public VehicleTypeByBodyTypes getVehicleTypeByBodyTypes() {
        return vehicleTypeByBodyTypes;
    }

    public VehicleTypeByFuelTypes getVehicleTypeByFuelTypes() {
        return vehicleTypeByFuelTypes;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    public String toString(){
        return this.model;
    }
}