package lesson8;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
//        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
//        VeryStrictDiet veryStrictDiet = new VeryStrictDiet();
//        veryStrictDiet.takeLunch(dayOfWeek);
//
//        for(Country country : Country.values()) {
//            System.out.println(country.getCurrency());
//        }

//        float wallet = 0.0f;
//        float productPrice = 0.01f;
//
//        for(int i = 1; i <= 100; i++) {
//            wallet += productPrice;
//        }
//        System.out.println(wallet);

//        BigDecimal wallet = new BigDecimal("0.0");
//        BigDecimal productPrice = new BigDecimal("0.01");
//
//        for(int i = 1; i <= 100; i++) {
//            wallet = wallet.add(productPrice);
//        }
//        System.out.println(wallet);

//        BigDecimal x = new BigDecimal("256");
//        BigDecimal y = new BigDecimal("247");
//        y = y.divide(x,RoundingMode.HALF_DOWN);
//        System.out.println(y);

//        Double a = 1.5;
//        Double b = 1.50;
//
//        System.out.println(a.equals(b));
//
//        BigDecimal x = new BigDecimal("1.5");
//        BigDecimal y = new BigDecimal("1.50");
//
//        System.out.println(x.equals(y));

//        BigDecimal b1 = new BigDecimal("4743.00001");
//        BigDecimal b2 = new BigDecimal("4743.00008");
//
//        if(b1.compareTo(b2) == 0) {
//            System.out.println(b1 + " and " + b2 + " are equal");
//        } else if(b1.compareTo(b2) > 0) {
//            System.out.println(b1 + " bigger than " + b2);
//        } else {
//            System.out.println(b1 + " smaller than " + b2);
//        }

//        System.out.println(Math.pow(1,2));
//        System.out.println(Math.pow(2,2));
//        System.out.println(Math.pow(3,2));
//        System.out.println(Math.pow(4,2));
//        System.out.println(Math.pow(5,2));
//
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.sqrt(9));
//
//        System.out.println(Math.cbrt(8)); // 2
//        System.out.println(Math.cbrt(27)); // 3
    }

    //Math tasks

    //Easy level
    //1 task
    public static int round(float value) {
        return Math.round(value);
    }

    //2 task
    public static int max(int a, int b) {
        return Math.max(a,b);
    }

    //3 task
    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    //4 task
    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    //5 task
    public static double findCirclePerimeter(double radius) {
        return Math.PI * radius;
    }

    public static double findLn(double value) {
        return Math.pow(Math.E,value);
    }

    //Middle level

    //1 task
    public static double solveTask1(double a, double b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    //2 task
    public static double convertToRadians(double a) {
        return Math.toRadians(a);
    }

    public static double convertToDegrees(double a) {
        return Math.toDegrees(a);
    }

    //3 task
    public static double solveTask3(double a, double b, double c) {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    //4 task
    public static void findLog10(double a) {
        System.out.println("Log10: " + Math.log10(a));
        System.out.println("Log: " + Math.log(a));
    }

    //5 task
    public static void solveTask5(double a) {
        System.out.println("sinus: " + Math.sin(a));
        System.out.println("cosinus: " + Math.cos(a));
        System.out.println("tangens: " + Math.tan(a));
    }

    //High level

    //1 task
    public static void solveQuadraticEquation(double a, double b, double c) {
        double discriminant = Math.pow(b,2) - (4*a*c);
        System.out.println("Discriminant = " + discriminant);

        double x1 = (b*-1 + Math.sqrt(discriminant)) / (2*a);
        double x2 = (b*-1 - Math.sqrt(discriminant)) / (2*a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

    //2 task
    public static void getDistanceBetweenPoints(double xa, double ya, double xb, double yb) {
        double distance = Math.sqrt(Math.pow(xb - xa,2) + Math.pow(yb - ya,2));
        System.out.println("Distance = " + distance);
    }

    //3 task
    public static void findFactorial(int number) {
        int factorial = 1;
        for(int i = 0; i < number; i++) {
            factorial = Math.multiplyExact(factorial,i+1);
        }
        System.out.println("Factorial of " + number + " = " + factorial);
    }

    //4 task
    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(Math.min(arr[j],arr[i]) == arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //5 task
    public static void calculateIncomeInYear(double amount, double interestRate) {
        //S = So * (P/100)^n
        amount += (amount * Math.pow(interestRate/100,1));
        System.out.println("Income of your investment in a year: " + amount);
    }
}
