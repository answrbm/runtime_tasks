package lesson5.inheritance;

public class Cat extends Animal {

    String color = "Black";

    public void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }

    @Override
    public void voice() {
        System.out.println("Cat voice");
    }

    public void work() {
        super.eat();
        voice();
    }
}
