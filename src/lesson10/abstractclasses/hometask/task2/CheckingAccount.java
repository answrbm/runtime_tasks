package lesson10.abstractclasses.hometask.task2;

public class CheckingAccount extends Account {

    public CheckingAccount(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + "$");
        if((balance - amount) >= 0) {
            balance -= amount;
        }
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
