package lesson8.hometask.task1;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.convertToKZT(new BigDecimal("1000"),Currency.EURO);

        currencyConverter.convertFromKZT(new BigDecimal("449450"),Currency.USD);
    }
}
