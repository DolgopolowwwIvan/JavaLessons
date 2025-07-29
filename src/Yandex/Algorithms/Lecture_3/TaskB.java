package Yandex.Algorithms.Lecture_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Даны два списка чисел, которые могут содержать до 10000 чисел каждый.
// Выведите все числа, которые входят как в первый, так и во второй
// список в порядке возрастания.
// Примечание. И даже эту задачу на Питоне можно решить в одну строчку.
public class TaskB {
    public static void main(String[] args) throws FileNotFoundException {
        var scanner = new Scanner(new File("D:\\Java\\practice\\JavaLessons\\src\\Yandex\\Algorithms\\Lecture_2New\\input.txt"));
        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();

        while (scanner.hasNextLine()) {
            int input = scanner.nextInt();
            list1.add(input);
        }

        while (scanner.hasNextLine()) {
            int input = scanner.nextInt();
            list2.add(input);
        }

        scanner.close();

        int Max = Math.max(list1.size(), list2.size());

        int listNew[] = new int[list1.toArray()];
        list2.toArray();

        for (int i = 0; i < Max; i++) {
            if(list1.){

            }
        }
    }
}
