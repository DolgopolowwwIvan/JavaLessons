package com.walking.Multithreading.Synchronized;

public class SynchronizedExample {

    private int counter;

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample synchronizedExample = new SynchronizedExample();
        synchronizedExample.doWork();
    }

    // synchronized - только один поток получает доступ к телу метода
    // в один момент времени, пока один поток исполняет тело метода,
    // остальные потоки ждут

    // У каждого объекта в java есть монитор и этот монитор в один момент времени
    // может принадлежать только одному потоку

    // Неявный synchronized

//    public synchronized void increment(){
//        counter++;
//    }

    // synchronized блок

    public void increment() {
        synchronized (this) {
            counter++;
        }

    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
