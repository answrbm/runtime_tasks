package lesson6.bigtasks.task2;

import lesson6.bigtasks.task2.taxes.IncomeTaxType;
import lesson6.bigtasks.task2.taxes.ProgressiveTaxType;
import lesson6.bigtasks.task2.taxes.TaxType;
import lesson6.bigtasks.task2.taxes.VATaxType;

class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        double taxAmount = taxType.calculateTaxFor(amount);

        taxService.payOut(taxAmount);
    }

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
                new Bill(100_000,new IncomeTaxType(),taxService),
                new Bill(3_000_000,new ProgressiveTaxType(),taxService),
                new Bill(483_000,new VATaxType(),taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}
