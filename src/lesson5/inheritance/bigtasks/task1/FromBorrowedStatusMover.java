package lesson5.inheritance.bigtasks.task1;

public class FromBorrowedStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if(book.getStatus() == Status.BORROWED) {
            switch (requestedStatus) {
                case BORROWED -> System.out.println("Перевод книги из статуса 'BORROWED' в статус 'BORROWED' невозможен");
                case AVAILABLE, ARCHIVED, OVERDUE -> book.setStatus(requestedStatus);
            }
        } else {
            System.out.println("Книга не имеет статус 'BORROWED'");
        }
    }
}
