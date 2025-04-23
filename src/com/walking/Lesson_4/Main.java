package com.walking.Lesson_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int fact = 1;

        for (int i = 1; i <= num1; i++) {
            fact *= i;
        }
        System.out.println(fact);

        //3
        int length = in.nextInt();
        int width = in.nextInt();


    }
}
