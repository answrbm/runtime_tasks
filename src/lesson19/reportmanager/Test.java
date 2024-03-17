package lesson19.reportmanager;

import lesson19.reportmanager.models.ReportManager;
import lesson19.reportmanager.models.Transaction;
import lesson19.reportmanager.models.YearlyTransactions;
import lesson19.reportmanager.utils.Month;
import lesson19.reportmanager.utils.ReportConsumer;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {

        ReportConsumer reportConsumer = new ReportConsumer();
        ReportManager reportManager = new ReportManager();

        List<Transaction> januaryTransactions = reportConsumer
                .readMonthlyReport("src/lesson19/reportmanager/resources/m.202101.csv");
        List<Transaction> februaryTransactions = reportConsumer
                .readMonthlyReport("src/lesson19/reportmanager/resources/m.202102.csv");
        List<Transaction> marchTransactions = reportConsumer
                .readMonthlyReport("src/lesson19/reportmanager/resources/m.202103.csv");

        YearlyTransactions fileYearlyTransactions = reportConsumer
                .readYearlyReport("src/lesson19/reportmanager/resources/y.2021.csv");

        YearlyTransactions manualYearlyTransactions = new YearlyTransactions();
        reportManager.addMonthlyTransactions(Month.JANUARY,januaryTransactions,manualYearlyTransactions);
        reportManager.addMonthlyTransactions(Month.FEBRUARY,februaryTransactions,manualYearlyTransactions);
        reportManager.addMonthlyTransactions(Month.MARCH,marchTransactions,manualYearlyTransactions);

        reportManager.compareYearlyTransactions(fileYearlyTransactions,manualYearlyTransactions);

        System.out.println("Yearly reports are equal: " + fileYearlyTransactions.equals(manualYearlyTransactions));
    }
}
