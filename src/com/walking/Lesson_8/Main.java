package com.walking.Lesson_8;

public class Main {
    public static void main(String[] args) {
        Counter evenCounter = new Counter("evenCounter");
        Counter oddCounter = new Counter("oddCounter");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                evenCounter.increment();
            }
            else {
                oddCounter.increment();
            }
        System.out.println(evenCounter.counter);
        System.out.println(oddCounter.counter);
        }
    }
}
