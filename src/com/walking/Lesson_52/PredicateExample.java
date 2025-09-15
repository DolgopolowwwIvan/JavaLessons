package com.walking.Lesson_52;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isAdult = (age) -> age >= 18;
        boolean answer = isAdult.test(30);

    }
}
