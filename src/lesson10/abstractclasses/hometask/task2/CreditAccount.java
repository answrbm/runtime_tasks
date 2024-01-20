package lesson10.abstractclasses.hometask.task2;

public class CreditAccount extends Account {

    public CreditAccount(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + "$");
        balance -= amount;
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Transferred " + amount + "$ to account " + account.getAccountNumber());
        balance -= amount;
    }

    @Override
    public void addMoney(int amount) {
        System.out.println("Returned " + amount + "$ to balance");
        if((balance + amount) <= 0) {
            balance += amount;
        } else {
            balance = 0;
        }
    }
}
