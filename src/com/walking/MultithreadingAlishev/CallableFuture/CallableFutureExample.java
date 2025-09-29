package com.walking.MultithreadingAlishev.CallableFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CallableFutureExample {
    private static int result;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        // Применяя ламбда выражения, java сама адаптирует
        // объект Runnable в Callable<Object>
        executorService.submit(() -> {
            System.out.println("Starting");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Finished");

            return result + 99999;
        });

        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int calculate(){
        return 5 + 4;
    }
}
