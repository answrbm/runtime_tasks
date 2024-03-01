package lesson15.hometask.task3;

public class Test {
    public static void main(String a[]) {
        Box<String, Banana> bananaBox = new Box<>("banana", new Banana());
        bananaBox.getValue().printClass();

        Box<String, Apple> appleBox = new Box<>("apple", new Apple());
        appleBox.getValue().printClass();

        Box<String, Fruit> fruitBox = new Box<>("fruit", new Fruit());
        fruitBox.getValue().printClass();

        // Box может хранить только фрукты
        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageBox.getValue().printClass();
    }
}

