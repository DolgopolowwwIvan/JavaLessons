package com.walking.Multithreading.PatternProducerConsumer;

import java.util.Scanner;

public class WaitAndNotifyExample {
    public static void main(String[] args) throws InterruptedException {

        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(() -> {
            try {
                wn.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                wn.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread started...");

            //Метод wait вызывается на this, который передан
            // аргументом в synchronized блок

            wait();
            // Что происходит при вызове:

            // 1 - мы отдаем intrinsic lock, на котором произошла синхронизация

            // 2 - в потоке, в котором был вызван wait - ждем
            // пока будет вызван notify

            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this){
            System.out.println("Waiting for return key pressed...");
            scanner.nextLine();
            notify();

            Thread.sleep(5000);
        }
    }
}
