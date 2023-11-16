package classwork.projects.garagesimulator;

import classwork.projects.garagesimulator.models.Vehicle;

public class Car extends Vehicle {

    private boolean isSportModeOn;

    public Car(String name, double speed) {
        super(name, speed);
    }

    public void switchSportMode() {
        if(isSportModeOn) {
            System.out.println("Sport mode was turned off");
            isSportModeOn = false;
        } else {
            System.out.println("Sport mode was turned on");
            isSportModeOn = true;
        }
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
