package lesson10.abstractclasses.hometask.task2;

public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, int balance) {
        super(accountNumber);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Cannot pay in savings account");
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Transferred " + amount + "$ to account " + account.getAccountNumber());
        if((balance - amount) >= 0) {
            balance -= amount;
        }
    }

    @Override
    public void addMoney(int amount) {
        System.out.println("Added " + amount + "$ to balance");
        balance += amount;
    }
}
