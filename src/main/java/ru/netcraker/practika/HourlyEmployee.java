package ru.netcraker.practika;

import lombok.Getter;
import lombok.Setter;

public class HourlyEmployee extends Employee {
    @Getter
    @Setter
    private double hourlyWage;

    /**
     Constructs an hourly employee with a given name and weekly wage.
     */
    public HourlyEmployee(String name, double hourlyWage) {
        super(name);
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        double pay = hoursWorked * hourlyWage;
        if (hoursWorked > 40)
        {
            // Add overtime
            pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
        }
        return pay;
    }
}


 
