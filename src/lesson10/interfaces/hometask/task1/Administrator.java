package lesson10.interfaces.hometask.task1;

public interface Administrator {

    void giveBook(Reader reader);

    void acceptBook(Reader reader);

    void overdueNotification(Reader reader);
}
