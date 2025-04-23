package com.walking.Lesson_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1
        Scanner in = new Scanner(System.in);

        System.out.println("Данные для задачи 1:");

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1 % 2 == 0){
            System.out.println(num1 * num2);
        }
        if (num1 == num2){
            System.out.println("Числа равны");
        }
        else {
            System.out.println(num1 - num2);
        }


        // 2
        System.out.println("Введите данные для задачи 2:");

        String str1 = in.nextLine();

        switch (str1){
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            case "How are you":
                System.out.println("How are your doing");
                break;
            default:
                System.out.println("Unknown message");
                break;
        }


        // 3

        System.out.println("Введите данные для задачи 3:");

        int int31 = in.nextInt();
        int int32 = in.nextInt();

        if (int31 % 2 == 0 || int32 % 3 == 0){
            System.out.println(int31 > int32);
        }
        if (int31 % 2 == 0 && int31 % 3 == 0){
            if(Math.pow(int31, int32) < Integer.MAX_VALUE && Math.pow(int31, int32) > Integer.MIN_VALUE){
                System.out.println(Math.pow(int31, int32));
            }
            else {
                System.out.println("Результат выражения слишком большой!");
            }
        }

    }
}
