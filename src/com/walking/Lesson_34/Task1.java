package com.walking.Lesson_34;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateTime = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime parsedTime = LocalDateTime.parse(dateTime, formatter);

        LocalDateTime now = (LocalDateTime.now());
        now.format(formatter);

        if (now.isAfter(parsedTime)){
            System.out.println("After");
        } else if (now.isBefore(parsedTime)) {
            System.out.println("Before");
        } else if (now.isEqual(parsedTime)) {
            System.out.println("Equal");
        }


    }
}
