package lesson7.classwork;

public class Bird extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Bird sings");
    }

    @Override
    public void sleep() {
        System.out.println("Bird sleeps on a tree branch");
    }
}
