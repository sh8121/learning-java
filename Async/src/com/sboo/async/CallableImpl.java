package com.sboo.async;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<Integer> {
    private int a;
    private int b;
    public CallableImpl(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        return a + b;
    }
}
