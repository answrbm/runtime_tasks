package lesson5.inheritance.bigtasks.task2.vehicletype.fuel;

import lesson5.inheritance.bigtasks.task2.vehicletype.VehicleTypeEnum;

public class HybridType extends VehicleTypeByFuelTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
