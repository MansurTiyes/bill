public class VATaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        double taxAmount = amount*0.18;
        return taxAmount;
    }
}
