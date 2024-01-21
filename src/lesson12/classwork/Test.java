package lesson12.classwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) {
        try {
            test2();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }

    public static void test() throws FileNotFoundException {
//        FileInputStream fis = new FileInputStream("C://file.txt");
        System.out.println(1/0);
    }

    public static void test2() throws FileNotFoundException, ClassCastException {
        test();
        System.out.println("Custom functions");
    }
}
