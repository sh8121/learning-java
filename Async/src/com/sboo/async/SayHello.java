package com.sboo.async;

import java.util.concurrent.*;

public class SayHello {
    private ExecutorService executor = Executors.newCachedThreadPool();

    public Future<String> sayHelloAsync1() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        executor.execute(() -> {
            System.out.println(Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
                completableFuture.complete("Hello");
            }
            catch (InterruptedException ex) {
                completableFuture.complete("Interrupted");
            }
        });

        return completableFuture
                .thenApply(s -> {
                    System.out.println(Thread.currentThread().getId());
                    try {
                        Thread.sleep(1000);
                        return s + " World";
                    }
                    catch (InterruptedException ex) {
                        return "Fail";
                    }
                });
    }

    public Future<String> sayHelloAsync2() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
                return "Hello";
            }
            catch (InterruptedException ex) {
                return "Fail";
            }
        })
        .thenCompose(s -> {
            return CompletableFuture.supplyAsync(() -> {
                System.out.println(Thread.currentThread().getId());
                return s  + "World";
            });
        });
//        .thenApply(s -> {
//            System.out.println(Thread.currentThread().getId());
//            try {
//                Thread.sleep(1000);
//                return s + " World";
//            }
//            catch (InterruptedException ex) {
//                return "Fail";
//            }
//        });
    }

    public Future<String> sayHelloAsyncWithCancellation() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        executor.submit(() -> {
            Thread.sleep(1000);
            completableFuture.cancel(false);
            return null;
        });

        return completableFuture;
    }
}
