package lesson19.reportmanager.models;

import lesson19.reportmanager.utils.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReportManager {

    public void addMonthlyTransaction(Month month, Transaction transaction, YearlyTransactions yearlyTransactions) {
        if(transaction.isExpense()) {
            yearlyTransactions.addMonthlyExpense(month,transaction);
        } else {
            yearlyTransactions.addMonthlyIncome(month,transaction);
        }
    }

    public void addMonthlyTransactions(Month month, List<Transaction> transactions, YearlyTransactions yearlyTransactions) {
        Transaction expenses = new Transaction();
        expenses.setExpense(true);
        Transaction incomes = new Transaction();
        incomes.setExpense(false);
        for(Transaction t : transactions) {
            if(t.isExpense()) {
                expenses.setAmount(expenses.getAmount() + t.getAmount());
            } else {
                incomes.setAmount(incomes.getAmount() + t.getAmount());
            }
        }
        addMonthlyTransaction(month, expenses, yearlyTransactions);
        addMonthlyTransaction(month,incomes,yearlyTransactions);
    }

    public void getMonthlyReport(Month month, List<Transaction> transactions) {
        double expenses = 0;
        double incomes = 0;

        for(Transaction t : transactions) {
            if(t.isExpense()) {
                expenses += t.getAmount();
            } else {
                incomes += t.getAmount();
            }
        }

        System.out.println(month + " expenses: " + expenses);
        System.out.println(month + " incomes: " + incomes);
    }

    public void compareYearlyTransactions(YearlyTransactions yearlyTransactions1, YearlyTransactions yearlyTransactions2) {
        Map<Month,Transaction> monthlyExpenses1 = yearlyTransactions1.getMonthlyExpenses();
        Map<Month,Transaction> monthlyExpenses2 = yearlyTransactions2.getMonthlyExpenses();
        System.out.println(monthlyExpenses1.equals(monthlyExpenses2));

    }
}
