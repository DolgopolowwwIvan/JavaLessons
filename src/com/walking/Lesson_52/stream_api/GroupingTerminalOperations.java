package com.walking.Lesson_52.stream_api;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingTerminalOperations {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(5, 6, 2);

        //Сумма всех элементов стрима
        integerList.stream().reduce(Integer::sum)
                .ifPresent(System.out::println);

        //Собрать элементы в лист
        Set<Integer> set = integerList.stream().collect(Collectors.toSet());
    }
}

