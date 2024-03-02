package lesson16.classwork;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Adam",25);
        User user2 = new User("Mark",26);

        Item item1 = new Item("Iphone 13",2000);
        Item item2 = new Item("Iphone 14",3000);
        Item item3 = new Item("MacBook",2500);
        Item item4 = new Item("Apple Watch",1500);

        Order order1 = new Order(user1,item1);
        Order order2 = new Order(user2,item2);
        Order order3 = new Order(user2,item2);
        Order order4 = new Order(user2,item4);

        item1.addOrder(order1);
        item2.addOrder(order2);
        item2.addOrder(order3);
        item4.addOrder(order4);

        System.out.println(item2.compareTo(item1));

        ItemSizeComparator itemSizeComparator = new ItemSizeComparator();
        System.out.println(itemSizeComparator.compare(item1,item2));
    }

}
