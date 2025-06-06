package Yandex.Algorithms.Lecture_1;

import java.util.Scanner;

public class Practice1_G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int M = scanner.nextInt();

        scanner.close();

        int count = 0;

        while(N >= K) {
            int Kdet = N / K; // 2 заготовки массой 5 кг из сплава
            N = N - Kdet * K;

            int Mdet;
            if (K >= M) {
                Mdet = K / M; // 2 детали из 1 заготовки
            } else {
                break;
            }

            for (int i = 0; i < (Mdet * Kdet); i++) {
                    count += 1;
            }
            N += (K % (M * Mdet)) * Kdet;
        }

        System.out.println(count);

    }
}
