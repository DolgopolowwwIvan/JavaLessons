package com.walking.Lesson_28;

import com.walking.Lesson_19.Model.Car;
import com.walking.Lesson_28.Task1.GenericForNumber;
import com.walking.Lesson_28.Task2.WrapperClass;
import com.walking.Lesson_28.Task3.GenericArray;

public class Main {
    public static void main(String[] args) {
        // Task1

        System.out.println(GenericForNumber.pow(111, 2.3));

        // Task2

        WrapperClass<Integer> integerWrapperClass = new WrapperClass<>(222222);

        //Task3

        String[] words = {"Apple", "Banana", "Orange"};
        GenericArray<String> array = new GenericArray<>(words);

        // Найденный элемент
        String found = array.valueFinder("Banana");  // Вернет "Banana"
        System.out.println(found);
        // Не найден — исключение
        String notFound = array.valueFinder("Grape");  // IllegalArgumentException
    }
}
