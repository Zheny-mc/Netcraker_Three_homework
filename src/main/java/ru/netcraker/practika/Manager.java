package ru.netcraker.practika;

import lombok.Getter;
import lombok.Setter;

public class Manager extends SalariedEmployee {
    @Getter
    @Setter
    private double weeklyBonus;
    /**
     Constructs a manager with a given name, annual salary, and weekly bonus.
     */
    public Manager(String name, double salary, double weeklyBonus) {
        super(name, salary);
        this.weeklyBonus = weeklyBonus;
    }

    @Override
    public double weeklyPay(int hours) {
        return super.weeklyPay(hours) + weeklyBonus;
    }
}