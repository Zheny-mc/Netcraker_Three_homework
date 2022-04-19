package ru.netcraker.ch3.p2;

import lombok.*;

import java.util.List;

//кассовый аппарат
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CashRegister_2 {
    private List<Double> recordTaxablePurchase;
    private double taxRate;

    public double giveChange(double purchase, double payment) {
        recordTaxablePurchase.add(payment);
        return payment*(1. - taxRate) - purchase;
    }

    public double getTotalTax() {
        return recordTaxablePurchase.stream()
                .mapToDouble(i -> i * taxRate).sum();
    }
}