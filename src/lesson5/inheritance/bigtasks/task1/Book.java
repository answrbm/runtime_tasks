package lesson5.inheritance.bigtasks.task1;

public class Book {

    private final String name;
    private Status status;

    public Book(String name) {
        this.name = name;
        this.status = Status.AVAILABLE;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
