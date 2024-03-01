package lesson15.hometask.task1;

public class Test {

    public static void main(String a[]) {
        // параметризируем класс типом String
        Box<String> sample1 = new Box<>("Runtime");
        System.out.println(sample1);
        // параметризируем класс типом Integer
        // Тип был указан для String. Нужно поменять тип дженерика на Integer
        Box<Integer> sample2 = new Box<>(1);
        System.out.println(sample2);
        // параметризируем класс типом Boolean
        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);
    }
}
