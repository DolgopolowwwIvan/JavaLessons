package com.walking.Lesson_52;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Выводить на экран "Не угадал!" до тех пор,
 * пока с клавиатуры не будет введено число 1.
 * Запрашивать число с клавиатуры перед выводом на экран "Не угадал!"
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stream.generate(() -> {
                    return scanner.nextInt();
                }).filter(num -> num == 1)
                .findFirst()
                .ifPresent(num -> System.out.println("fggf"));


        scanner.close();
    }
}
