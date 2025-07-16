package Yandex.Algorithms.Lecture_2New;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskG {
    //    В данном списке из n ≤ 105 целых чисел найдите три числа,произведение которых максимально.
//    Решение должно иметь сложность O(n), где n - размер списка.
//    Выведите три искомых числа в любом порядке.
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("D:\\Java\\practice\\JavaLessons\\src\\Yandex\\Algorithms\\Lecture_2New\\input.txt"));
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            list.add(input);
        }

        scanner.close();

        Integer max1 = Integer.MIN_VALUE; // Самый большой
        Integer max2 = Integer.MIN_VALUE;
        Integer max3 = Integer.MIN_VALUE;

        Integer min1 = Integer.MAX_VALUE; // Самый маленький
        Integer min2 = Integer.MAX_VALUE;
        Integer min3 = Integer.MAX_VALUE;

        Integer maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            // Проверка максимумов больше max1 max2 max3
            if (list.get(i) >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = list.get(i);
            }
            else if ((list.get(i) >= max2) && (list.get(i) <= max1)) {
                max3 = max2;
                max2 = list.get(i);
            }
            else if ((list.get(i) >= max3) && (list.get(i) <= max1) && (list.get(i) <= max2)) {
                max3 = list.get(i);
            }

            // Проверка минимумов меньше min1 min2 min3
            if (list.get(i) <= min1) {
                min2 = min1;
                min1 = list.get(i);
            }
            else if (list.get(i) <= min2)  {
                min2 = list.get(i);
            }
        }
        long sum1 = (long)max1 * max2 * max3; //полож
        long sum2 = (long)max1 * Math.abs(min1) * Math.abs(min2);

        System.out.println(sum1);
        System.out.println(sum2);

        if (sum1 > sum2) {
            System.out.println(max1);
            System.out.println(max2);
            System.out.println(max3);
            System.out.println("perv");
        } else if (sum1 < sum2) {
            System.out.println(max1);
            System.out.println(min1);
            System.out.println(min2);
            System.out.println("vtor");
        }else {
            System.out.println(max1);
            System.out.println(min1);
            System.out.println(min2);
            System.out.println("tret");
        }
        System.out.println(max1);
        System.out.println(min1);
        System.out.println(min2);
        // 1000000 -999994 -999987
        //1000000
        //999995
        //999972
    }

}

