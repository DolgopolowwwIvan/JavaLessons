package com.walking.Lesson_5;

public class Main {
    public static void main(String[] args) {
        //1
        char[] myName = new char[] {'i', 'v', 'a','n'};
        String myName1 = "";
        for (char i: myName){
            myName1 += i;
        }
        System.out.println(myName1);

        //2
        int[] primeNumbers = new int[10];
        int count = 0; // Счетчик найденных простых чисел
        int number = 2; // Начинаем проверку с числа 2

        while (count < 10) {
            if (isPrime(number)) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }

        // Вывод массива простых чисел (для проверки)
        System.out.print("Первые 10 простых чисел: ");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
        System.out.println();

        // Вычисление суммы элементов массива
        int sum = 0;
        for (int prime : primeNumbers) {
            sum += prime;
        }

        // Вывод суммы в консоль
        System.out.println("Сумма первых 10 простых чисел: " + sum);
    }

    // Функция для проверки, является ли число простым
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 и отрицательные числа не простые
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Если делится без остатка на i, то не простое
            }
        }
        return true; // Если не делится ни на что, кроме 1 и себя, то простое
    }
}
