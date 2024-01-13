package lesson10.interfaces.hometask.task1;

public class AdministratorWorker extends User implements Administrator, LibraryWorker {

    public AdministratorWorker(String name) {
        super(name);
    }

    @Override
    public void giveBook(Reader reader) {
        User readerUser = (User) reader;
        System.out.println("Administrator " + getName() + " give the book to the reader " + readerUser.getName());
        reader.takeBook(this);
    }

    @Override
    public void acceptBook(Reader reader) {
        User readerUser = (User) reader;
        System.out.println("Administrator " + getName() + " accepted the book from the reader " + readerUser.getName());
    }

    @Override
    public void overdueNotification(Reader reader) {
        User readerUser = (User) reader;
        System.out.println("Administrator " + getName() + " notified the reader " + readerUser.getName() + " about an overdue");
    }

    @Override
    public void orderBook(LibrarySupplier librarySupplier) {
        User supplierUser = (User) librarySupplier;
        System.out.println("Library worker " + getName() + " ordered the book/books from the supplier " + supplierUser.getName());
    }
}
