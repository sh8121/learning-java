package com.sboo.async;

import java.util.concurrent.RecursiveTask;

public class FactorialSquareCalculator extends RecursiveTask<Integer> {
    private Integer n;

    FactorialSquareCalculator(Integer n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if(n <= 1) {
            return n;
        }

        FactorialSquareCalculator calculator = new FactorialSquareCalculator(n - 1);
        calculator.fork();

        try {
            Thread.sleep(1000);
        }
        catch (Exception ex) {}

        return n * n + calculator.join();
    }
}
