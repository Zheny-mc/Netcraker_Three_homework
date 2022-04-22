package ru.netcraker.practika;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 An employee with a name and a mechanism for computing weekly pay.
 */
@AllArgsConstructor
public class Employee {
    @Getter
    @Setter
    private String name;

    /**
     Computes the pay for one week of work.
     @param hoursWorked the number of hours worked in the week
     @return the pay for the given number of hours
     */
    public double weeklyPay(int hoursWorked) {
        return 0.;
    }
}