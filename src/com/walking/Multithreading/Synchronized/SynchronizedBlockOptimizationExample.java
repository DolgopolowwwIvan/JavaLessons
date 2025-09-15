package com.walking.Multithreading.Synchronized;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchronizedBlockOptimizationExample {
    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}

class Worker {
    private static final Random random = new Random(2222);

    final Object lock1 = new Object();
    final Object lock2 = new Object();

    private final List<Integer> list1 = new ArrayList<>();
    private final List<Integer> list2 = new ArrayList<>();

    public void addToList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main() {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {work();});
        Thread thread2 = new Thread(() -> {work();});

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        long after = System.currentTimeMillis();
        System.out.println("AMOUNT OF TIME(ms): " + (after - before));

        System.out.println();

        System.out.println(list1.size());
        System.out.println(list2.size());
    }
}
