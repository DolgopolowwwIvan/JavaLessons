package com.walking.Lesson_52.Practice1;

import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1,3),
                List.of(3,4,4),
                List.of(5,5,6,6)
        );

//        list.stream().anyMatch(list -> list.stream().reduce((a,b) -> a + b));
    }
}
