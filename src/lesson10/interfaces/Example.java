package lesson10.interfaces;

public abstract class Example implements Drawable, Eatable {

    private String title;

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}
