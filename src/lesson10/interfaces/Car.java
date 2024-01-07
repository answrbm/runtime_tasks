package lesson10.interfaces;

public interface Car {

    default void gas() {
        System.out.println("Gas");
    }

    default void brake() {
        System.out.println("Brake");
    }
}
