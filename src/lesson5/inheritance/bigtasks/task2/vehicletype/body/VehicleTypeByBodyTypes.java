package lesson5.inheritance.bigtasks.task2.vehicletype.body;

import lesson5.inheritance.bigtasks.task2.vehicletype.VehicleType;

public class VehicleTypeByBodyTypes extends VehicleType {

    public VehicleTypeByBodyTypes() {
        super("Vehicle type by body types");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByBodyTypes that = (VehicleTypeByBodyTypes) object;
        return attribute != null && attribute.equals(that.attribute);
    }
}
