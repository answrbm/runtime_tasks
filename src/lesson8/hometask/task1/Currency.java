package lesson8.hometask.task1;

import java.math.BigDecimal;

public enum Currency {

    USD(new BigDecimal("457.6")),
    EURO(new BigDecimal("500.091")),
    GBP(new BigDecimal("579.197"));

    private final BigDecimal rateValue;

    Currency(BigDecimal rateValue) {
        this.rateValue = rateValue;
    }

    public BigDecimal getRateValue() {
        return rateValue;
    }
}
