package Yandex.Algorithms.Lecture_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task_A {
    public static void main(String[] args) {
        String filePath =  "input.txt";
        List<Integer> numbers = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                if (line.trim().isEmpty()) continue;
                String[] numberStrings = line.split("\\s+");
                for (String numStr : numberStrings) {
                    try {
                        numbers.add(Integer.parseInt(numStr));
                    } catch (NumberFormatException e) {
                        System.err.println("Ошибка: '" + numStr + "' не является числом");
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
            return;
        }


        if (numbers.isEmpty()) {
            System.out.println("NO");
            return;
        }

        boolean isArrayIncreases = true;

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) >= numbers.get(i + 1)) {
                isArrayIncreases = false;
                break;
            }
        }

        System.out.println(isArrayIncreases ? "YES" : "NO");
    }
}