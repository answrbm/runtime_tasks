package lesson5.inheritance.bigtasks.task2.vehicletype.purpose;

import lesson5.inheritance.bigtasks.task2.vehicletype.VehicleTypeEnum;

public class CarType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
