package com.walking.MultithreadingAlishev.Volatile;

import java.util.Scanner;

public class VolatileExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        thread.shutdown();

    }
}

class MyThread extends Thread {

    // volatile гарантирует, что переменная не будет случайно
    // изменена в кеше потока, то есть вообще не будет кешироваться.
    // Эта переменная всегда будет находиться в Главной памяти
    // Main memory
    private volatile boolean isRunning = true;

    public void run() {
        while (isRunning) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown(){
        this.isRunning = false;
    }
}
