package lesson3;

public class Car {

    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void start() {
        System.out.println("The car " + brand + " " + model + " " + " started.");
        System.out.println("The max speed: " + speed);
    }

    public void stop() {
        System.out.println("The car " + brand + " " + model + " " + " stopped.");
        System.out.println("The max speed: " + speed);
    }
}
