package lesson7.classwork;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps in a cozy place");
    }
}
