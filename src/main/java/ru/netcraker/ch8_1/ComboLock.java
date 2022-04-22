package ru.netcraker.ch8_1;


import java.util.LinkedList;
import java.util.List;

public class ComboLock {
    private final List<Integer> secretNumbers;
    private int currentNumber;
    private List<Integer> testSecretNumber;

    public ComboLock(List<Integer> secretNumbers) {
        this.secretNumbers = secretNumbers;
        this.testSecretNumber = new LinkedList<>();
    }

    public ComboLock reset() {
        currentNumber = 0;
        testSecretNumber.clear();
        return this;
    }

    public ComboLock turnLeft(int ticks) {
        if (testSecretNumber.size() <= 3 && currentNumber - ticks >= 0) {
            currentNumber -= ticks;
            testSecretNumber.add(currentNumber);
        }
        return this;
    }

    public ComboLock turnRight(int ticks) {
        if (testSecretNumber.size() <= 3 && currentNumber + ticks <= 35) {
            currentNumber += ticks;
            testSecretNumber.add(currentNumber);
        }
        return this;
    }

    public boolean open() {
        boolean res = testSecretNumber.equals(secretNumbers);
        testSecretNumber.clear();
        return res;
    }
}