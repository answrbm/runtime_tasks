package lesson5.inheritance.bigtasks.task2.vehicletype.fuel;

import lesson5.inheritance.bigtasks.task2.vehicletype.VehicleTypeEnum;

public class DieselType extends VehicleTypeByFuelTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
