package lesson16.classwork;

import java.util.ArrayList;
import java.util.List;

public class Item implements Comparable<Item> {

    private String title;
    private double price;
    private List<Order> orders;

    public Item(String title, double price) {
        this.title = title;
        this.price = price;
        this.orders = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public int compareTo(Item o) {
        return (int) (Math.round(price) - Math.round(o.price));
    }
}
