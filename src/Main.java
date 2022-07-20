public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        TaxType taxType = new TaxType();
        Bill[] payments = new Bill[]{
            new Bill(450000, new IncomeTaxType(), taxService),
            new Bill(500000, new ProgressiveTaxType(), taxService),
            new Bill(3000000, new VATaxType(), taxService),
            new Bill(1000000, new ProgressiveTaxType(), taxService)};
        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
