package lesson5.inheritance.bigtasks.task1;

public class FromArchievedStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if(book.getStatus() == Status.ARCHIVED) {
            switch (requestedStatus) {
                case ARCHIVED, BORROWED, OVERDUE -> {
                    if (requestedStatus == Status.ARCHIVED)
                        System.out.println("Перевод книги из статуса 'ARCHIVED' в статус 'ARCHIVED' невозможен");
                    if (requestedStatus == Status.BORROWED)
                        System.out.println("Перевод книги из статуса 'ARCHIVED' в статус 'BORROWED' невозможен");
                    if (requestedStatus == Status.OVERDUE)
                        System.out.println("Перевод книги из статуса 'ARCHIVED' в статус 'OVERDUE' невозможен");
                }
                case AVAILABLE -> book.setStatus(requestedStatus);
            }
        } else {
            System.out.println("Книга не имеет статус 'ARCHIVED'");
        }
    }
}
