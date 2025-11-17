package src.entities;

public class ImportedProduct extends Product {
    
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, double customsFee) {
        super (name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return this.customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(double totalPrice){
        return getPrice() + (getPrice() * (customsFee/100));
    }

    @Override
    public final String toString() {
        return getName() + " $ " + String.format("%.2f", totalPrice(customsFee)) 
        + "(Customs fee: " 
        + String.format("%.0f", getCustomsFee())
        + "%)";
    }

}
