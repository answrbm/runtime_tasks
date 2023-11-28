package lesson8;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

        BigDecimal b1 = new BigDecimal("4743.00001");
        BigDecimal b2 = new BigDecimal("4743.00008");

        if(b1.compareTo(b2) == 0) {
            System.out.println(b1 + " and " + b2 + " are equal");
        } else if(b1.compareTo(b2) > 0) {
            System.out.println(b1 + " bigger than " + b2);
        } else {
            System.out.println(b1 + " smaller than " + b2);
        }
    }
}
