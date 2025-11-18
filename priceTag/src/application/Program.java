package src.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

import src.enums.ProductType;
import src.exceptions.DateException;
import src.entities.Product;
import src.entities.UsedProduct;
import src.entities.ImportedProduct;

public class Program {
    public static void main(String[] args) {
    
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>(); 

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        try{
            for (int i=1; i<=n; i++){
                sc.nextLine();
                System.out.println("Product #" + i +" data:");
                System.out.print("Common, used or imported (c/u/i)? ");
                String productType = sc.next();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                if (productType.equals("u")){
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date manufactureDate = sdf.parse(sc.next());
                    Product usedProduct = new UsedProduct(name, price, manufactureDate, ProductType.USED);

                    products.add(usedProduct);
                }
                if (productType.equals("i")){
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    Product importedProduct = new ImportedProduct(name, price, customsFee, ProductType.IMPORTED);
                    products.add(importedProduct);
                }
                if (productType.equals("c")){
                    Product commomProduct = new Product(name, price, ProductType.COMMOM);
                    products.add(commomProduct);
                }
            }
        } catch (ParseException e){
            throw new DateException(e.getMessage());
        }
        System.out.println("PRICE TAGS: ");
        for (Product p : products){
            System.out.println(p);
        }
        sc.close();
    }

                
}

