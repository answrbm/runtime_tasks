package classwork.projects.garagesimulator.vehicles;


public class Motorcycle extends Vehicle {
    public Motorcycle(String name, double speed) {
        super(name, speed);
    }

    public void startEngine() {
        System.out.println("Motorcycle engine is started");
    }

    public void stopEngine() {
        System.out.println("Motorcycle engine is stopped");
    }
}
