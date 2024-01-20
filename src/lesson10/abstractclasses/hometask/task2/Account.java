package lesson10.abstractclasses.hometask.task2;

public abstract class Account {

    private int accountNumber;
    protected int balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public abstract void pay(int amount);
    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);
}
