package com.walking.Lesson_47.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Список
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerList.add(i);
        }

        integerList.forEach(Main::print);
    }

    private static <T> void print(T value){
        System.out.println(value.toString());
    }

}
