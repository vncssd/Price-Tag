package src.entities;

import src.enums.ProductType;

public class Product {

    private String name;
    private Double price;
    private ProductType productType;


    public Product() {
    }

    public Product(String name, Double price, ProductType productType) {
        this.name = name;
        this.price = price;
        this.productType = productType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String toString() {
        return getName() + " $ " + String.format("%.2f",getPrice()*100);
    }


}
