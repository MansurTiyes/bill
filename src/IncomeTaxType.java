public class IncomeTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount){
        double taxAmount = amount*0.13;
        return taxAmount;
    }
}
