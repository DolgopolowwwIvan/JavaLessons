package com.walking.Lesson_52.optional;

import java.util.List;

public class GetOneElementOperations {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(4, 8, 2);
        System.out.println(integerList.stream().findFirst().orElseThrow());

        System.out.println(integerList.stream().max((a,b) -> a - b).orElseThrow());

        System.out.println(integerList.stream().min((a,b) -> a - b).orElseThrow());

        List<Student> students = List.of(
                new Student(21, "Oleg"),
                new Student(19, "Ivan"),
                new Student(22, "Armen")
        );

        //Получить самого старшего студента
        System.out.println(students
                .stream()
                .max((student1, student2) -> student1.getAge() - student2.getAge())
                .orElseThrow()
        );

        //Получить студента с самым коротким именем

    }
}
