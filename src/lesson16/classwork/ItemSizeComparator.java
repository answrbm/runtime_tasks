package lesson16.classwork;

import java.util.Comparator;

public class ItemSizeComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        return o1.getOrders().size() - o2.getOrders().size();
    }
}
