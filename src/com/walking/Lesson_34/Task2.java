package com.walking.Lesson_34;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), formatter);
        LocalDateTime end = LocalDateTime.parse(scanner.nextLine(), formatter);
        if (start.isAfter(end)) {
            LocalDateTime temp = start;
            start = end;
            end = temp;
            System.out.println("(Вторая дата была раньше первой, даты были переставлены)");
        }

        scanner.close();
        Period period = Period.between(start.toLocalDate(), end.toLocalDate());

        // Вычисляем продолжительность (часы, минуты, секунды)
        Duration duration = Duration.between(start, end);

        System.out.println("\nРазница между датами:");
        System.out.println("----------------------------------");
        System.out.printf("Лет: %,d%n", period.getYears());
        System.out.printf("Месяцев: %,d%n", period.getMonths());
        System.out.printf("Дней: %,d%n", period.getDays());
        System.out.printf("Часов: %,d%n", duration.toHours() % 24);
        System.out.printf("Минут: %,d%n", duration.toMinutes() % 60);
        System.out.printf("Секунд: %,d%n", duration.getSeconds() % 60);
        System.out.println("----------------------------------");
        System.out.printf("Всего дней: %,d%n", duration.toDays());
        System.out.printf("Всего часов: %,d%n", duration.toHours());
        System.out.printf("Всего минут: %,d%n", duration.toMinutes());
        System.out.printf("Всего секунд: %,d%n", duration.getSeconds());


    }
}
