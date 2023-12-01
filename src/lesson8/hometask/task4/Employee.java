package lesson8.hometask.task4;

import java.math.BigDecimal;
public class Employee {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.addWorkHours(new BigDecimal("40"),Time.REGULAR);
        employee.addWorkHours(new BigDecimal("20"),Time.OVERTIME);
        employee.showRegularWorkHours();
        employee.showOvertimeWorkHours();
    }

    private BigDecimal regularWorkHours;
    private BigDecimal overtimeWorkHours;

    public Employee() {
        this.regularWorkHours = new BigDecimal("0");
        this.overtimeWorkHours = new BigDecimal("0");
    }

    public void addWorkHours(BigDecimal workHours, Time timeType) {
        if(timeType.equals(Time.REGULAR)) {
            regularWorkHours = regularWorkHours.add(workHours);
        } else {
            overtimeWorkHours = overtimeWorkHours.add(workHours);
        }
    }

    public void showRegularWorkHours() {
        System.out.println("Employee regular work hours: " + regularWorkHours);
    }

    public void showOvertimeWorkHours() {
        System.out.println("Employee overtime work hours: " + overtimeWorkHours);
    }
}
