package com.walking.Lesson_50;

import java.util.*;
import java.util.stream.Collectors;


public class Task1 {

    public static List<String> mapToUppercase (String... names){
        return Arrays
                .stream(names)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
// Тут не заметил что метод принимает varang
