package lesson3;

public class Test {

    private String firstName;
    private String lastName;
    private int age;
    private String hobby;

    public static void main(String[] args) {
        Car car1 = new Car("Mercedes-Benz","S",250);
        Car car2 = new Car("Tesla","3",200);

        car1.start();
        car2.start();

        car1.stop();
        car2.stop();


        printName("Ansar","Bektassov");
        printSum(1,2,3);

        int quantity;
        int counter;
    }

    public static void printName(String firstName, String lastName) {
        System.out.println("Ваша фамилия: " + lastName + ", ваше имя: " + firstName);
    }

    public static void printSum(int a, int b, int c) {
        System.out.println("Сумма трех чисел равна: " + (a+b+c));
    }

    public static void eat() {
        int quantity = 256;
        String foodName = "burger";
        System.out.println(foodName + " in storage: " + quantity);
    }

    public static int sumOfDigits() {
        return 24 + 25;
    }

    public static String getHelloWorld() {
        return "Hello World";
    }


}
