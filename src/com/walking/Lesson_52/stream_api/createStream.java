package com.walking.Lesson_52.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class createStream {
    public static void main(String[] args) {

        //Создание из массива
        int[] numbers = {1,2,3,45};
        IntStream stream = Arrays.stream(numbers);
        stream.forEach(System.out::print);
        System.out.println();

        //Создание из коллекции
        List<Integer> integerList = List.of(1, 2, 3);
        Stream<Integer> stream1 = integerList.stream();
        stream1.forEach(System.out::print);
        System.out.println();

        //Создание из элементов
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        integerStream.forEach(System.out::print);
        System.out.println();

        Stream.generate(() -> 1).limit(3).forEach(e -> System.out.print(e));

    }
}
