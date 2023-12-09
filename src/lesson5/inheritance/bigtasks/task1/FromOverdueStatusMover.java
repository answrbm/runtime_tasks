package lesson5.inheritance.bigtasks.task1;

public class FromOverdueStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if(book.getStatus() == Status.OVERDUE) {
            switch (requestedStatus) {
                case BORROWED -> System.out.println("Перевод книги из статуса 'OVERDUE' в статус 'BORROWED' невозможен");
                case OVERDUE -> System.out.println("Перевод книги из статуса 'OVERDUE' в статус 'OVERDUE' невозможен");
                case AVAILABLE, ARCHIVED -> book.setStatus(requestedStatus);
            }
        } else {
            System.out.println("Книга не имеет статус 'OVERDUE'");
        }
    }
}
