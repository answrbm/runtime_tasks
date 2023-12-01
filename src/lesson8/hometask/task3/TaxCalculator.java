package lesson8.hometask.task3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculator {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calculate(new BigDecimal("500000"),IncomeType.INVESTMENTS);
    }

    public void calculate(BigDecimal amount, IncomeType incomeType) {
        amount = amount.divide(new BigDecimal("100"),2,RoundingMode.CEILING);
        switch (incomeType) {
            case RENT -> System.out.println(amount.multiply(new BigDecimal("5")));
            case SALARY -> System.out.println(amount.multiply(new BigDecimal("25")));
            case INVESTMENTS -> System.out.println(amount.multiply(new BigDecimal("2")));
            case DEPOSIT -> System.out.println(amount.multiply(new BigDecimal("0.5")));
        }
    }
}
