package Yandex.Algorithms.Lecture_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Дан список чисел, который может содержать до 100000 чисел. Определите, сколько в нем встречается различных чисел.
public class TaskA {
    public static void main(String[] args) throws FileNotFoundException {
        var scanner = new Scanner(new File("input.txt"));
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            list.add(input);
        }

        scanner.close();

        Set<Integer> answer = new HashSet<>(list);

        System.out.println(answer.size());
    }
}
