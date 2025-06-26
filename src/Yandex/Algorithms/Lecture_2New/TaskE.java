package Yandex.Algorithms.Lecture_2New;

import java.util.*;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] throwsArray = new int[n];
        for (int i = 0; i < n; i++) {
            throwsArray[i] = scanner.nextInt();
        }


        int maxThrow = 0;
        for (int throwDist : throwsArray) {
            if (throwDist > maxThrow) {
                maxThrow = throwDist;
            }
        }


        int[] sortedThrows = throwsArray.clone();
        Arrays.sort(sortedThrows);

        int bestVasilyPlace = 0;
        int currentMaxBefore = 0;

        for (int i = 0; i < n; i++) {
            boolean hasWinnerBefore = (currentMaxBefore == maxThrow);
            boolean endsWithFive = (throwsArray[i] % 10 == 5);
            boolean nextIsLess = (i < n - 1) && (throwsArray[i] > throwsArray[i + 1]);

            if (endsWithFive && hasWinnerBefore && nextIsLess) {
                int vasilyThrow = throwsArray[i];
                int left = 0, right = n - 1;
                int countGreater = 0;


                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (sortedThrows[mid] > vasilyThrow) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                countGreater = n - left;

                int vasilyPlace = countGreater + 1;
                if (bestVasilyPlace == 0 || vasilyPlace < bestVasilyPlace) {
                    bestVasilyPlace = vasilyPlace;
                }
            }

            if (throwsArray[i] > currentMaxBefore) {
                currentMaxBefore = throwsArray[i];
            }
        }

        System.out.println(bestVasilyPlace);
    }
}

