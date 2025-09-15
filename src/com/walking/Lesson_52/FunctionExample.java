package com.walking.Lesson_52;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> automate = (money) -> {
            if (money == 100){
                return "CocaCola";
            }
            if (money == 50){
                return "Water";
            }else {
                return "Nothing";
            }
        };

        System.out.println(automate.apply(100));
    }
}
