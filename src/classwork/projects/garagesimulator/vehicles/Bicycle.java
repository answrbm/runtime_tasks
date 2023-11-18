package classwork.projects.garagesimulator.vehicles;

import classwork.projects.garagesimulator.vehicles.Vehicle;

public class Bicycle extends Vehicle {

    private int gearsQuantity;

    public Bicycle(String name, double speed, int gearsQuantity) {
        super(name, speed);
        this.gearsQuantity = gearsQuantity;
    }

    public void changeGears(int gear) {
        if(gear <= gearsQuantity && gear >= 1)
            System.out.println("Gear switched to " + gear);
        else
            System.out.println("Gear should be between 1 and " + gearsQuantity);
    }
}
