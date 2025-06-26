package Yandex.Algorithms.Lecture_1;

import java.util.Scanner;

public class Practice1_J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        scanner.close();

        double det = a*d - b*c;

        if (Math.abs(det) > 1e-10){
            double x = ((a*d - d*f)/det);
            double y = ((a*f - e*c)/det);
            System.out.printf("2 %.5f %.5f", x, y);
        }else {

            if (Math.abs(a) < 1e-10 && Math.abs(b) < 1e-10 && Math.abs(c) < 1e-10 && Math.abs(d) < 1e-10) {
                if (Math.abs(e) < 1e-10 && Math.abs(f) < 1e-10) {
                    System.out.println(5);
                } else {
                    System.out.println(0);
                }
            } else if (Math.abs(a) < 1e-10 && Math.abs(c) < 1e-10) {
                if (Math.abs(e) < 1e-10 && Math.abs(f) < 1e-10) {

                    if (Math.abs(b) > 1e-10 || Math.abs(d) > 1e-10) {
                        System.out.println("4 0.00000");
                    } else {
                        System.out.println(5);
                    }
                } else {

                    if (Math.abs(e) > 1e-10 || Math.abs(f) > 1e-10) {
                        System.out.println(0);
                    }
                }
            } else if (Math.abs(b) < 1e-10 && Math.abs(d) < 1e-10) {
                if (Math.abs(e) < 1e-10 && Math.abs(f) < 1e-10) {

                    System.out.println("3 0.00000"); // x = 0
                } else {

                    double x0 = e / a;
                    double x1 = f / c;
                    if (Math.abs(x0 - x1) < 1e-10) {
                        System.out.printf("3 %.5f", x0);
                    } else {
                        System.out.println(0);
                    }
                }
            } else {

                double k1 = (Math.abs(a) > 1e-10) ? c / a : Double.POSITIVE_INFINITY;
                double k2 = (Math.abs(b) > 1e-10) ? d / b : Double.POSITIVE_INFINITY;
                double k3 = (Math.abs(e) > 1e-10) ? f / e : Double.POSITIVE_INFINITY;

                if (Math.abs(k1 - k2) < 1e-10 && Math.abs(k1 - k3) < 1e-10) {

                    double k, m;
                    if (Math.abs(a) > 1e-10) {
                        k = -a / b;
                        m = e / b;
                    } else {
                        k = -c / d;
                        m = f / d;
                    }
                    System.out.printf("1 %.5f %.5f", k, m);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}

         


