package lesson5.inheritance.bigtasks.task1;

public class FromAvailableStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if(book.getStatus() == Status.AVAILABLE) {
            switch (requestedStatus) {
                case AVAILABLE, OVERDUE -> {
                    if (requestedStatus == Status.AVAILABLE)
                        System.out.println("Перевод книги из статуса 'AVAILABLE' в статус 'AVAILABLE' невозможен");
                    if (requestedStatus == Status.OVERDUE)
                        System.out.println("Перевод книги из статуса 'AVAILABLE' в статус 'OVERDUE' невозможен");
                }
                case ARCHIVED, BORROWED -> book.setStatus(requestedStatus);
            }
        } else {
            System.out.println("Книга не имеет статус 'AVAILABLE'");
        }
    }
}
