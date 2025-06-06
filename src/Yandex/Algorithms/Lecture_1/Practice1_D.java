package Yandex.Algorithms.Lecture_1;

import java.util.Scanner;

public class Practice1_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        scanner.close();

        if (c < 0){
            System.out.println("NO SOLUTION");
        } else if (a == 0) {
            double b2 = b;
            double sqrtb2 = Math.sqrt(b2);
            b2 = sqrtb2;
            if (b2 == c){
                System.out.println("MANY SOLUTIONS");
            }
            else {
                System.out.println("NO SOLUTION");
            }

        } else {
            double x = (c*c - b)/a;
            if (x % 1 != 0){
                System.out.println("NO SOLUTION");
            }else {
                System.out.println((int) x);

            }

        }

    }
}
