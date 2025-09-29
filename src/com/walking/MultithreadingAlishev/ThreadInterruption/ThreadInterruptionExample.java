package com.walking.MultithreadingAlishev.ThreadInterruption;

import java.util.Random;

public class ThreadInterruptionExample {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            Random random = new Random();
            for (int i = 0; i < 100_000_000; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread has been interrupted");
                    break;
                }
                Math.sin(random.nextDouble(100));
            }
        });

        System.out.println("Starting thread...");

        thread1.start();

        Thread.sleep(1000);
        thread1.interrupt();

        thread1.join();

        System.out.println("Thread has finished.");
    }

}
