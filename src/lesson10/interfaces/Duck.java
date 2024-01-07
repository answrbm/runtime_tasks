package lesson10.interfaces;

public class Duck implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
}
