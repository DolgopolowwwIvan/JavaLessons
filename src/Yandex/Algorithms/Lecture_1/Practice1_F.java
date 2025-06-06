package Yandex.Algorithms.Lecture_1;

import java.util.Scanner;

public class Practice1_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        
        scanner.close();

        //a1 к a
        int v1 = Math.max(a1,a) * (b+b1);
        //b1 к a
        int v2 = Math.max(b1,a) * (b + a1);
        //b1 к b
        int v3 = (a1 + a) * Math.max(b1,b);
        //a1 к b
        int v4 = (a + b1) * Math.max(b,a1);
        
        if(v1 <= v2 && v1 <= v3 && v1 <= v4){
            System.out.println(Math.max(a1,a) + " " + (b+b1));
        } else if (v2 <= v1 && v2 <= v3 && v2 <= v4) {
            System.out.println(Math.max(b1,a) + " " + (b + a1));
        } else if (v3 <= v1 && v3 <= v2 && v3 <= v4) {
            System.out.println((a1 + a) + " " + Math.max(b1,b));
        } else {
            System.out.println((a + b1) + " " + Math.max(b,a1));
        }


    }
}
