package src.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    private Date manufactureDate;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super (name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String toString() {
        return getName() +
         " (Used) " 
         + " $ " + String.format("%.2f",getPrice())
         + " (Manufacture date: " 
         + sdf.format(manufactureDate) 
         + ")";
    }

}
