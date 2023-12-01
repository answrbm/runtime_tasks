package lesson8.hometask.task2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SaleRecord {

    public static void main(String[] args) {
        SaleRecord saleRecord = new SaleRecord();
        Product product1 = new Product("Milk",Category.FOOD_STUFF,new BigDecimal("320"));
        Product product2 = new Product("T-shirt",Category.CLOTHES,new BigDecimal("7000"));
        Product product3 = new Product("Teraflu",Category.DRUGS,new BigDecimal("800"));
        Product product4 = new Product("Chair",Category.FURNITURE,new BigDecimal("25000"));
        Product product5 = new Product("Barbie",Category.TOYS,new BigDecimal("3000"));
        saleRecord.sellProduct(product1);
        saleRecord.sellProduct(product2);
        saleRecord.sellProduct(product3);
        saleRecord.sellProduct(product4);
        saleRecord.sellProduct(product5);
        saleRecord.showSoldProducts();
    }

    private List<Product> soldProducts;

    public SaleRecord() {
        this.soldProducts = new ArrayList<>();
    }

    public void sellProduct(Product product) {
        soldProducts.add(product);
    }

    public void showSoldProducts() {
        System.out.println("Sold products:");
        soldProducts.forEach(Product::display);
    }
}
