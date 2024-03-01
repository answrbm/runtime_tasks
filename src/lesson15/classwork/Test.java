package lesson15.classwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        Box box4 = new Box(1,12.3);
//        System.out.println(box4.getValue());

//        List<String> strings = new ArrayList<>();
//        strings.add("Old string 1");
//        strings.add("Old string 2");
//        strings.add("Old string 3");
//
//        fill(strings,"New string");
//
//        System.out.println(strings);
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        fill(numbers,888);
//
//        System.out.println(numbers);

//        Hat hat = new Hat("brown");
//        Cap cap = new Cap("orange");
//        Box<String, Hat> box = new Box<>("Hat",cap);

//        String str = "Test!";
//        // no problems
//        Object obj = str;
//
//        List<String> strings = new ArrayList<>();
//        // compilation error
//        List<Object> objects = strings;

//        List<Cat> cats = new ArrayList<>();
//        cats.add(new Cat());
//        cats.add(new Cat());
//        cats.add(new Cat());
//        cats.add(new Cat());
//
//        // compilation error
//        iterateAnimals(cats);

//        List<Animal> animals = new ArrayList<>();
//        animals.add(new Animal());
//        animals.add(new Animal());
//
//        List<Pet> pets = new ArrayList<>();
//        pets.add(new Pet());
//        pets.add(new Pet());
//
//        List<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//
//        List<Cat> cats = new ArrayList<>();
//        cats.add(new Cat());
//        cats.add(new Cat());
//
//        iterateAnimals(animals);
//        iterateAnimals(pets);
//        iterateAnimals(cats);
//        // compilation error
//        iterateAnimals(dogs);

//        Integer i = 1;
//        Double d = 2.0;
//        Long l = 3L;
//        System.out.println(sumOfSquares(List.of(i,d,l)));
//
//
//        List<Number> objects = new ArrayList<>();
//        add(objects);
//
//        System.out.println(calc(objects));

        Cache<Number> cache = new Cache<>();
        cache.setMaxSize(Integer.TYPE,4);
        cache.addElement(Integer.TYPE,8);
        cache.addElement(Integer.TYPE,3);
        cache.addElement(Integer.TYPE,2);
        cache.addElement(Integer.TYPE,5);
        cache.addElement(Integer.TYPE,9);
        cache.addElement(Integer.TYPE,8);

        System.out.println(cache.getElements(Integer.TYPE));

    }

    public static void iteratePureAnimals(Collection<? extends Animal> animals) {
        for(Animal animal : animals) {
            System.out.println("One more step in cycle");
        }
    }

    public static void iterateAnimals(Collection<? super Cat> animals) {
        for(int i = 0; i < animals.size(); i++) {
            System.out.println("One more step in cycle");
        }
    }

    public static <T> void fill(List<T> list, T value) {
        for(int i = 0; i < list.size(); i++) {
            list.set(i,value);
        }
    }

    //Задание: Напишите метод, который принимает на вход список элементов, реализующих интерфейс Number,
    // и возвращает сумму их квадратов. Используйте ограничение сверху для wildcard.
    public static Double sumOfSquares(List<? extends Number> numbers) {
        double sum = 0.0;
        for(Number number : numbers) {
            sum += Math.pow(number.doubleValue(),2);
        }
        return sum;
    }

    //Задание 2: Напишите метод, который добавляет в список объекты типа Integer.
    // Метод должен быть способен добавлять числа в список любых объектов, которые являются суперклассами для Integer
    // (например, Number или Object).
    // Используйте ограничение снизу для wildcard.
    public static void add(List<? super Integer> numbers) {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);
    }

    //Задание 3: Создайте обобщенный метод, который принимает на вход коллекцию объектов любого типа,
    // который является подклассом Number, и возвращает их среднее арифметическое в виде double.
    public static double calc(Collection<? extends Number> numbers) {
        double sum = 0;
        for(Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum/numbers.size();
    }

}
