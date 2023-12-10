package lesson6.bigtasks.task2.taxes;

public class VATaxType extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        return amount * 0.18;
    }
}
