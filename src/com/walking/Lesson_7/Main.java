package com.walking.Lesson_7;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str1 = "1111";
        String str2 = "2222";
        String str3 = "3333";
        String str4 = "4444";
        String str5 = "5555";
        System.out.println(concatenateIt(str1, str5, str2));
        System.out.println(concatenateIt(str4, str5, str3));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        double result = calculateNestedSquareRoots(n);
        System.out.println("Результат выражения: " + result);

        scanner.close();

    }
    public static int sumForAny(int a, int b){
        return a + b;
    }
    public static double sumForAny(double a, double b){
        return a + b;
    }
    public boolean sumForAny(boolean a, boolean b){
        return a && b;
    }
    public char sumForAny(char a, char b){
        return a += b;
    }

    public static String concatenateIt(String ... str){

        if (str == null || str.length == 0) {
            return ""; // Возвращаем пустую строку, если массив null или пустой
        }//Надо приучатся проверять на пустоту (gpt)

        StringBuilder tempString = new StringBuilder();
        for(String s: str){
            tempString.append(s);
        }
        return tempString.toString();
    }

    public static double calculateNestedSquareRoots(int n) {
        if (n < 1) {
            System.out.println("Ошибка: N должно быть больше или равно 1.");
            System.exit(0); // Завершаем программу
            return 0; // Это никогда не выполнится, но нужно для компиляции
        }

        return calculateRecursive(n);
    }

    private static double calculateRecursive(int n) {
        if (n == 1) {
            return Math.sqrt(1);
        } else {
            return Math.sqrt(n + calculateRecursive(n - 1));
        }
    }
}
