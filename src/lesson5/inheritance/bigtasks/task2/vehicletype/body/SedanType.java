package lesson5.inheritance.bigtasks.task2.vehicletype.body;

import lesson5.inheritance.bigtasks.task2.vehicletype.VehicleTypeEnum;

public class SedanType extends VehicleTypeByBodyTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
