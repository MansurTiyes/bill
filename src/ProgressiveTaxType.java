public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount){
        double taxAmount;
        if (amount<100000){
            taxAmount = amount * 0.1;
        } else{
            taxAmount = amount * 0.15;
        }
        return taxAmount;
    }
}
