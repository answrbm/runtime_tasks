package lesson10.interfaces.hometask.task1;

public class SupplierImpl extends User implements LibrarySupplier {

    public SupplierImpl(String name) {
        super(name);
    }

    @Override
    public void supplyBooks(LibraryWorker libraryWorker) {
        User workerUser = (User) libraryWorker;
        System.out.println("Supplier " + getName() + " supplied the book/books to the library worker " + workerUser.getName());
    }
}
