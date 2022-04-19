package ru.netcraker.ch3.p1;

import lombok.*;

//кассовый аппарат
@NoArgsConstructor
public class CashRegister {
    @Getter
    private int itemCount;

    public double giveChange(double purchase, double payment) {
        itemCount++;
        return payment - purchase;
    }
}