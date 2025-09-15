package com.walking.Lesson_52.Comparator;



import java.util.Comparator;

public class Example {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 190);
        Student student2 = new Student("Oleg", 170);

        Student[] students = {student1, student2};

        Comparator<Student> studentComparator = (std1, std2) -> std1.getHeight() - std2.getHeight();
        System.out.println(studentComparator.compare(student1, student2));
    }


}
