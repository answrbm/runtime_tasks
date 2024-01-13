package lesson10.interfaces.hometask.task1;

public class Test {

    public static void main(String[] args) {
        Reader reader = new SupplierReader("Adam");
        Administrator admin = new AdministratorWorker("Sam");
        reader.returnBook(admin);

        LibrarySupplier supplier = new SupplierReader("Mark");
        LibraryWorker worker = new AdministratorWorker("Bob");
        supplier.supplyBooks(worker);
    }
}
