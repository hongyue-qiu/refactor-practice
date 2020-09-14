package com.twu.refactoring;

public class NumberCruncher {
    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int countNumber() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) count++;
        }
        return count;
    }
    public int countEven() {
        countNumber();
    }

    public int countOdd() {
        countNumber();
    }

    public int countPositive() {
        countNumber();
    }

    public int countNegative() {
        countNumber();
    }
}
