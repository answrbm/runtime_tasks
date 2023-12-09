package lesson5.inheritance.bigtasks.task2.vehicletype.body;

import lesson5.inheritance.bigtasks.task2.vehicletype.VehicleTypeEnum;

public class BusType extends VehicleTypeByBodyTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
