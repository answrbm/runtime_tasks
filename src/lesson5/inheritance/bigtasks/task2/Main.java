package lesson5.inheritance.bigtasks.task2;

import lesson5.inheritance.bigtasks.task2.vehicletype.body.PickupType;
import lesson5.inheritance.bigtasks.task2.vehicletype.body.SedanType;
import lesson5.inheritance.bigtasks.task2.vehicletype.fuel.DieselType;
import lesson5.inheritance.bigtasks.task2.vehicletype.fuel.ElectricType;
import lesson5.inheritance.bigtasks.task2.vehicletype.fuel.PetrolType;
import lesson5.inheritance.bigtasks.task2.vehicletype.purpose.CarType;
import lesson5.inheritance.bigtasks.task2.vehicletype.purpose.PassengerType;
import lesson5.inheritance.bigtasks.task2.vehicletype.purpose.TruckType;

public class Main {

    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());

        //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом
        VehicleAd zeekrAd = new VehicleAd("Zeekr", "001", new CarType(),
                new SedanType(), new ElectricType());
        VehicleAd mercedesAd = new VehicleAd("Mercedes", "S class", new CarType(),
                new SedanType(), new PetrolType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd, zeekrAd, mercedesAd});

        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}
