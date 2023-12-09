package lesson5.inheritance.bigtasks.task1;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        System.out.println(book.getStatus());
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println(book.getStatus());
    }
}
