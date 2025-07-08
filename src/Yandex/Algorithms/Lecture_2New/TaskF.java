package Yandex.Algorithms.Lecture_2New;

import java.util.*;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> array = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();
            array.add(i, value);
        }

        scanner.close();

        for (int i = 0; i < N; i++) {
            if(!Objects.equals(array.get(i), array.get(N-1)) && (N != 0)){
                array.add(array.get(i));
                N -= 1;
            }else{
                break;
            }
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

    }
}
