package com.walking.MultithreadingAlishev.PatternProducerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            try {
                produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private static void produce() throws InterruptedException {
        final Random random = new Random(222);

        while (true){
            queue.put(random.nextInt(100));
        }
    }

    private static void consume() throws InterruptedException {
        while (true){
            Thread.sleep(100);

            System.out.println(queue.take());
            System.out.println("Queue size: " + queue.size());
        }
    }
}
