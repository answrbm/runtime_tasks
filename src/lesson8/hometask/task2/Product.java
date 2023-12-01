package lesson8.hometask.task2;

import java.math.BigDecimal;

public class Product {
    private String name;
    private Category category;
    private BigDecimal price;

    public Product(String name, Category category, BigDecimal price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Product: " + name + ", category: " + category + ", price: " + price);
    }
}
