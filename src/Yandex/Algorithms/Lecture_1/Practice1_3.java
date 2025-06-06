package Yandex.Algorithms.Lecture_1;


import java.util.Scanner;

public class Practice1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String newNumber = scanner.nextLine();

        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
        String number3 = scanner.nextLine();

        String[] numbers = {newNumber, number1, number2, number3};

        scanner.close();

        for (int i = 0; i < numbers.length; i++) {
            char[] chars = numbers[i].toCharArray();
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] != '+' && chars[j] != '(' && chars[j] != ')' && chars[j] != '-') {
                    sb.append(chars[j]);
                }
            }
            numbers[i] = sb.toString();

            if (numbers[i].length() == 11){
                numbers[i] = numbers[i].substring(1);
            } else if (numbers[i].length() == 7) {
                numbers[i] = "495" + numbers[i];
            }
        }

        for (int i = 0; i < numbers.length-1 ; i++) {
            if (numbers[0].equals(numbers[i+1])){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }
}
