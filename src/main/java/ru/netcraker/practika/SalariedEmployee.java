package ru.netcraker.practika;

import lombok.Getter;
import lombok.Setter;

public class SalariedEmployee extends Employee {
    @Getter
    @Setter
    private double annualSalary;

    /**
     Constructs a salaried employee with a given name and annual salary.
     */
    public SalariedEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        final int WEEKS_PER_YEAR = 52;
        return annualSalary / WEEKS_PER_YEAR;
    }
}