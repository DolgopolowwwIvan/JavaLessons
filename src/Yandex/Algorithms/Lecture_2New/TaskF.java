package Yandex.Algorithms.Lecture_2New;

import java.util.*;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();


        boolean isSymmetric = true;
        for (int i = 0; i < N / 2; i++) {
            if (array[i] != array[N - 1 - i]) {
                isSymmetric = false;
                break;
            }
        }

        if (isSymmetric) {
            System.out.println(0);
            return;
        }


        for (int i = 0; i < N; i++) {
            boolean valid = true;
            for (int j = i, k = N - 1; j <= k; j++, k--) {
                if (array[j] != array[k]) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                System.out.println(i);
                for (int j = i - 1; j >= 0; j--) {
                    System.out.println(array[j]);
                }
                return;
            }
        }


        System.out.println(N - 1);
        for (int i = N - 2; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

}
