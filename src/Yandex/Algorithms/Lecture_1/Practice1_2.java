package Yandex.Algorithms.Lecture_1;

import java.util.Scanner;

public class Practice1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();

        if (a > 0 && b > 0 && c > 0){
            if ((a+b) > c && c > (a-b)){
                System.out.println("YES");
            } else if ((a+c) > b && b > (a-c)) {
                System.out.println("YES");
            } else if ((c+b) > a && a > (c-b)) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }else {
            System.out.println("NO");
        }


    }
}
