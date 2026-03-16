package com.company.payroll;
import com.company.hr.Employee;
public class Payroll {
    public double calculateBonus(Employee e) {
        double salary = e.getSalary();
        double bonus = salary * 0.10;
        return salary + bonus;
    }
}