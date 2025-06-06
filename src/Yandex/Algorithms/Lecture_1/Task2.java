package Yandex.Algorithms.Lecture_1;

public class Task2 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;

        double D = Math.pow(b,2) - 4*a*c;
        if(a==0){
            if (b!=0){System.out.println(-c/b);}
        }
        else if (D == 0){
            double x1 = -b / (2*a);
            System.out.println(x1);

        } else if (D > 0) {
            double x1 = ((-b + Math.sqrt(D)) / 2*a);
            double x2 = ((-b - Math.sqrt(D)) / 2*a);

            System.out.println(x1);
            System.out.println(x2);
        }


    }
}
