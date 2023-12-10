package lesson6.bigtasks.task2.taxes;

public class ProgressiveTaxType extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        if(amount < 100_000)
            return amount * 0.10;
        else
            return amount * 0.15;
    }
}
