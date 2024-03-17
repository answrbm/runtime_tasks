package lesson19.reportmanager.utils;

import lesson19.reportmanager.models.Transaction;
import lesson19.reportmanager.models.YearlyTransactions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReportConsumer {

    public List<Transaction> readMonthlyReport(String reportPath) throws IOException {
        List<String> transactionLines = Files.readAllLines(Path.of(reportPath));
        return transactionsMapper(transactionLines.subList(1,transactionLines.size()));
    }

    public YearlyTransactions readYearlyReport(String reportPath) throws IOException {
        List<String> transactionLines = Files.readAllLines(Path.of(reportPath));
        transactionLines = transactionLines.subList(1,transactionLines.size());
        return yearlyTransactionMapper(transactionLines);
    }

    private List<Transaction> transactionsMapper(List<String> transactionLines) {
        List<Transaction> transactions = new ArrayList<>();
        for(String transactionLine : transactionLines) {
            String[] transaction = transactionLine.split(",");
            boolean isExpense = Boolean.parseBoolean(transaction[1]);
            int quantity = Integer.parseInt(transaction[2]);
            double unitPrice = Double.parseDouble(transaction[3]);

            transactions.add(new Transaction((quantity*unitPrice),isExpense));
        }
        return transactions;
    }

    private YearlyTransactions yearlyTransactionMapper(List<String> transactionLines) {
        YearlyTransactions yearlyTransactions = new YearlyTransactions();
        for(String transactionLine : transactionLines) {
            String[] transactionParts = transactionLine.split(",");
            Month month = monthMapper(transactionParts[0]);
            double amount = Double.parseDouble(transactionParts[1]);
            boolean isExpense = Boolean.parseBoolean(transactionParts[2]);

            Transaction t = new Transaction();
            t.setAmount(amount);
            if(isExpense) {
                t.setExpense(true);
                yearlyTransactions.addMonthlyExpense(month, t);
            } else {
                t.setExpense(false);
                yearlyTransactions.addMonthlyIncome(month, t);
            }
        }

        return yearlyTransactions;
    }

    private Month monthMapper(String month) {
        switch (month) {
            case "01" -> {
                return Month.JANUARY;
            }
            case "02" -> {
                return Month.FEBRUARY;
            }
            case "03" -> {
                return Month.MARCH;
            }
            case "04" -> {
                return Month.APRIL;
            }
            case "05" -> {
                return Month.MAY;
            }
            case "06" -> {
                return Month.JUNE;
            }
            case "07" -> {
                return Month.JULY;
            }
            case "08" -> {
                return Month.AUGUST;
            }
            case "09" -> {
                return Month.SEPTEMBER;
            }
            case "10" -> {
                return Month.OCTOBER;
            }
            case "11" -> {
                return Month.NOVEMBER;
            }
            case "12" -> {
                return Month.DECEMBER;
            }
        }
        return null;
    }
}
