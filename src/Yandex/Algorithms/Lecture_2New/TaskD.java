package Yandex.Algorithms.Lecture_2New;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class TaskD {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("input.txt"))) {

            String line = scanner.nextLine();
            String[] parts = line.split(" ");


            for (String part : parts) {
                try {
                    numbers.add(Integer.parseInt(part));
                } catch (NumberFormatException e) {
                    System.out.println("Пропущено нечисловое значение: " + part);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            e.printStackTrace();
        }

        int counter = 0;
        for (int i = 1; i < numbers.size() - 1; i++) {
            if(numbers.get(i-1) < numbers.get(i) && numbers.get(i+1) < numbers.get(i)){
                counter += 1;
            }

        }

        System.out.print(counter);


    }
}
