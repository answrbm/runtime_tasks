package lesson5.inheritance.bigtasks.task2.vehicletype.body;

import lesson5.inheritance.bigtasks.task2.vehicletype.VehicleTypeEnum;

public class WagonType extends VehicleTypeByBodyTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
