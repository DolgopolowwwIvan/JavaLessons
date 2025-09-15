package com.walking.Lesson_52;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> talon = () -> new Random().nextInt(100);
        System.out.println(talon.get());
    }
}
