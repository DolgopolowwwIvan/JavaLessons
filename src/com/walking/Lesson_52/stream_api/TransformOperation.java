package com.walking.Lesson_52.stream_api;

import com.walking.Lesson_52.optional.Student;

import java.util.List;

public class TransformOperation {
    public static void main(String[] args) {

        Student petr = new Student(20, "Petr");
        Student yuri = new Student(21, "Yuri");
        Student oleg = new Student(22, "Oleg");

        List<Student> students = List.of(petr,yuri, oleg);

        students.stream()
                .peek(e -> System.out.println(e))
                .map(student -> student.getAge())
                .peek(e -> System.out.println(e))
                .forEach(e -> {});
    }
}
