package com.walking.Lesson_17;

import java.util.Scanner;

public class Task2SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String greeting = scanner.nextLine();

        scanner.close();

        Answers greetingType = Answers.findGreetingType(greeting);
        System.out.println(greetingType.getAnswer());
    }
}
