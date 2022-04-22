package ru.netcraker.ch3.p9;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Battery {
    private final double initialCapacity;
    private double capacity;

    public Battery(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            initialCapacity = capacity;
        } else {
            throw new RuntimeException("source data error: capacity");
        }
    }

    public void drain(double amount) {
        if (capacity - amount >= 0) {
            capacity -= amount;
        }
    }

    public void charge() {
        capacity = initialCapacity;
    }
}
