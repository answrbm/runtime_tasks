package lesson5.inheritance.bigtasks.task2.vehicletype.purpose;

import lesson5.inheritance.bigtasks.task2.vehicletype.VehicleTypeEnum;

public class PassengerType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}
