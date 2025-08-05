package com.walking.Lesson_50;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class FlatMap {

//    public static List<String> transform(List<List<String>> collection) {
//        List<String> newCollection = new ArrayList<>();
//        for (List<String> subCollection : collection) {
//            for (String value : subCollection) {
//                newCollection.add(value);
//            }
//        }
//        return newCollection;
//    }
    public static List<String> transform (List<List<String>> collection){
        return collection
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

    }
}
