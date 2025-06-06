package Yandex.Algorithms.Lecture_1;

import java.util.Scanner;

public class Practice1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int troom = scanner.nextInt();
        int tcond = scanner.nextInt();
        scanner.nextLine();
        String mode = scanner.nextLine();

        scanner.close();
        if (troom >= -50 && troom <= 50 && tcond >= -50 && tcond <= 50){
            if (mode.equals("freeze")){
                if(troom <= tcond){
                    System.out.println(troom);
                }
                else{
                    System.out.println(tcond);
                }

            } else if (mode.equals("heat")) {
                if(troom >= tcond){
                    System.out.println(troom);
                }
                else{
                    System.out.println(tcond);
                }

            } else if (mode.equals("auto")) {
                System.out.println(tcond);

            } else if (mode.equals("fan")) {
                System.out.println(troom);
            }
        }

    }
}
