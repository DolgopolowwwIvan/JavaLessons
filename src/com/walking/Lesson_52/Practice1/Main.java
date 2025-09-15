package com.walking.Lesson_52.Practice1;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(3,5,6,7,2,35,566,643,2,3,45,5);
        Random random = new Random(1);

        Integer result = integerList.stream()
                .filter(e -> e > 4)
                .distinct()
                .map(integer -> new User(integer, null))
                .peek(
                        user -> user.setIntegerList(Stream.generate(() -> random.nextInt(10))
                                .limit(user.getUserId())
                                .toList()))
                .flatMap(user -> user.getIntegerList().stream())
                .map(number -> number * 10)
                .reduce((a, b) -> a + b)
                .orElse(0);

        System.out.println(result);
    }
}
