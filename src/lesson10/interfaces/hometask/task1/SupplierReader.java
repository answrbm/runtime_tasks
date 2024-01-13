package lesson10.interfaces.hometask.task1;

public class SupplierReader extends User implements LibrarySupplier, Reader {

    public SupplierReader(String name) {
        super(name);
    }

    @Override
    public void supplyBooks(LibraryWorker libraryWorker) {
        User workerUser = (User) libraryWorker;
        System.out.println("Library supplier " + getName() + " supplied the book/books to the library worker " + workerUser.getName());
    }

    @Override
    public void takeBook(Administrator admin) {
        User adminUser = (User) admin;
        System.out.println("Reader " + getName() + " take the book/books from the library administrator " + adminUser.getName());
    }

    @Override
    public void returnBook(Administrator admin) {
        User adminUser = (User) admin;
        System.out.println("Reader " + getName() + " returned the book/books to the library administrator " + adminUser.getName());
    }
}
