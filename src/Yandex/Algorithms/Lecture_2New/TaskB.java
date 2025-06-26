package Yandex.Algorithms.Lecture_2New;


import java.util.ArrayList;
import java.util.Scanner;

//По последовательности чисел во входных данных определите ее вид:
//
//CONSTANT – последовательность состоит из одинаковых значений
//ASCENDING – последовательность является строго возрастающей
//WEAKLY ASCENDING – последовательность является нестрого возрастающей
//DESCENDING – последовательность является строго убывающей
//WEAKLY DESCENDING – последовательность является нестрого убывающей
//RANDOM – последовательность не принадлежит ни к одному из вышеупомянутых типов
//
//Формат ввода
//
//По одному на строке поступают числа последовательности ai, |ai| ≤ 109.
//
//Признаком окончания последовательности является число -2× 109. Оно в последовательность не входит.
//        Формат вывода
//
//В единственной строке выведите тип последовательности.
public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();

        int b = scanner.nextInt();
        while ( b != -2000000000){
            array.add(b);
            b = scanner.nextInt();

        }

        boolean CONSTANT = true;
        boolean ASCENDING = true;
        boolean WEAKLY_ASCENDING = true;
        boolean DESCENDING = true;
        boolean WEAKLY_DESCENDING = true;


        for (int i = 0; i < array.size() - 1; i++) {
            int current = array.get(i);
            int next = array.get(i+1);

            if (current != next) CONSTANT = false;
            if (current >= next) ASCENDING = false;
            if (current > next) WEAKLY_ASCENDING = false;
            if (current <= next) DESCENDING = false;
            if (current < next) WEAKLY_DESCENDING = false;
        }

        if (CONSTANT) {
            System.out.println("CONSTANT");
        } else if (ASCENDING) {
            System.out.println("ASCENDING");
        } else if (WEAKLY_ASCENDING) {
            System.out.println("WEAKLY ASCENDING");
        } else if (DESCENDING) {
            System.out.println("DESCENDING");
        } else if (WEAKLY_DESCENDING) {
            System.out.println("WEAKLY DESCENDING");
        } else {
            System.out.println("RANDOM");
        }


    }
}
