package lesson8;

public enum Country {
    CANADA("CAD"),
    USA("USD"),
    GERMANY("EUR");

    private final String currency;

    Country(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }
}
