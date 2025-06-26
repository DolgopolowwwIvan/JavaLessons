package Yandex.Algorithms.Lecture_2New;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            int a = scanner.nextInt();
            array[i] = a;
        }

        int x = scanner.nextInt();
        scanner.close();

        int index = 0;
        int numberWithTheSmallestDifference = 20001;


        for (int i = 0; i < array.length; i++) {
            int temp = Math.abs(x - array[i]);
            if (numberWithTheSmallestDifference > temp) {
                numberWithTheSmallestDifference = temp;
                index = i;
            }
        }
        if (numberWithTheSmallestDifference == 0) {
            System.out.println(x);
        } else {
            System.out.println(array[index]);
        }



    }
}
