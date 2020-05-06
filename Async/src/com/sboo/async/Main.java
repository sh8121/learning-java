package com.sboo.async;

import java.time.LocalDateTime;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception{
//        SquareCalculator calculator = new SquareCalculator();
//        Future<Integer> future1 = calculator.calculate(5);
//        Future<Integer> future2 = calculator.calculate(6);
//
//        while(!(future1.isDone() && future2.isDone())){
//            System.out.println("Calculating...");
//            Thread.sleep(1000);
//        }
//        Integer result1 = future1.get();
//        Integer result2 = future2.get();
//        System.out.println(result1);
//        System.out.println(result2);

//        ForkJoinPool forkJoinPool = new ForkJoinPool();
//        FactorialSquareCalculator calculator = new FactorialSquareCalculator(10);
//        Future<Integer> future = forkJoinPool.submit(calculator);
//        Integer result = future.get();

        System.out.println(LocalDateTime.now());
        Future<String> future1 = new SayHello().sayHelloAsync2();
        Future<String> future2 = new SayHello().sayHelloAsync2();
        //Future<String> future = new SayHello().sayHelloAsyncWithCancellation();
        String result1 = future1.get();
        String result2= future2.get();
        System.out.println(result1 + " "  + result2);
        System.out.println(LocalDateTime.now());
    }
}
