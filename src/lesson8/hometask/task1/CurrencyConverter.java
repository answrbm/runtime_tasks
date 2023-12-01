package lesson8.hometask.task1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {

    public void convertFromKZT(BigDecimal value, Currency currency) {
        BigDecimal convertedValue = value.divide(currency.getRateValue(),3,RoundingMode.CEILING);
        System.out.println(value + " KZT in " + currency.name() + ":" + convertedValue);
    }

    public void convertToKZT(BigDecimal value, Currency currency) {
        BigDecimal convertedValue = value.multiply(currency.getRateValue());
        System.out.println(value + " " + currency.name() + " in KZT:" + convertedValue);
    }
}
