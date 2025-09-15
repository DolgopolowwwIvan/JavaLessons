package com.walking.Lesson_52;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> fire = (item) -> {
            if (item.equals("wood")){
                System.out.println("Долго");
            }
            else if (item.equals("Paper")){
                System.out.println("Ярко");
            }
        };

        fire.accept("wood");
    }
}
