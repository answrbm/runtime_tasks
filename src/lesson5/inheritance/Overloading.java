package lesson5.inheritance;

public class Overloading {
    public void test(int a) {
        System.out.println("Целое число: " + a);
    }

    public void test(String a) {
        System.out.println("Строка: " + a);
    }

    public void test(double a) {
        System.out.println("Дробное число: " + a);
    }
}
