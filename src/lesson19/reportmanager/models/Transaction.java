package lesson19.reportmanager.models;

public class Transaction {

    private double amount;
    private boolean isExpense;

    public Transaction() {
    }

    public Transaction(double amount, boolean isExpense) {
        this.amount = amount;
        this.isExpense = isExpense;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isExpense() {
        return isExpense;
    }

    public void setExpense(boolean expense) {
        isExpense = expense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (Double.compare(that.amount, amount) != 0) return false;
        return isExpense == that.isExpense;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(amount);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isExpense ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", isExpense=" + isExpense +
                '}';
    }
}
