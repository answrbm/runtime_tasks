package lesson19.reportmanager.models;

import lesson19.reportmanager.utils.Month;

import java.util.*;

public class YearlyTransactions {

    private final Map<Month, Transaction> monthlyExpenses;
    private final Map<Month, Transaction> monthlyIncomes;

    public YearlyTransactions() {
        this.monthlyExpenses = new HashMap<>();
        this.monthlyIncomes = new HashMap<>();
    }

    public Map<Month, Transaction> getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public Map<Month, Transaction> getMonthlyIncomes() {
        return monthlyIncomes;
    }

    public void addMonthlyExpense(Month month, Transaction transaction) {
        monthlyExpenses.putIfAbsent(month,transaction);
        Transaction t = monthlyExpenses.get(month);
        t.setAmount(transaction.getAmount());
    }

    public void addMonthlyIncome(Month month, Transaction transaction) {
        monthlyIncomes.putIfAbsent(month,transaction);
        Transaction t = monthlyIncomes.get(month);
        t.setAmount(transaction.getAmount());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YearlyTransactions that = (YearlyTransactions) o;

        if (!Objects.equals(monthlyExpenses, that.monthlyExpenses))
            return false;
        return Objects.equals(monthlyIncomes, that.monthlyIncomes);
    }

    @Override
    public int hashCode() {
        int result = monthlyExpenses.hashCode();
        result = 31 * result + monthlyIncomes.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "YearlyTransactions{" +
                "monthlyExpenses=" + monthlyExpenses +
                ", monthlyIncomes=" + monthlyIncomes +
                '}';
    }
}
