package lesson5.inheritance.bigtasks.task2.vehicletype.purpose;

import lesson5.inheritance.bigtasks.task2.vehicletype.VehicleTypeEnum;

public class TruckType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
