package com.walking.Lesson_20;


import com.walking.Lesson_20.model.File;
import com.walking.Lesson_20.model.FileType;
import com.walking.Lesson_20.service.FileService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService(initFiles());

        File desiredFile = createFile();
        File foundFile = fileService.getFileByName(String.valueOf(desiredFile.getName));

        System.out.println(foundFile);
    }

    private static File createFile() {
//        Неудачный шаг со сканером, повторно использовать метод createfile() мы не сможем.
//        Спишем на условности
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a file name");
        String name = scanner.nextLine();

        System.out.println("Enter a file size");
        Long file_size = scanner.nextLong();

        FileType type = null;
        while (type == null){
            System.out.println("Введите тип файла (TEXT, IMAGE, AUDIO, VIDEO): \"");
            String typeInput = scanner.nextLine().toUpperCase();

            try{
                type = FileType.valueOf(typeInput);
            }catch (IllegalArgumentException e){
                System.out.println("Ошибка! Неверный тип файла, проверьте доку суки");
            }
        }

        scanner.close();

        return new File(name, file_size, type);
    }

    private static File[] initFiles() {
        File file2 = new File("Toyota", 2222, TEXT);
        File file5 = new File("Toyota", 333333,);
        File file6 = new File("Toyota",22222,);
        File file4 = new File("Toyota","Green");
        File file7 = new File("Toyota", "Green");
        File file8 = new File("BMW","Green");
        File file1 = new File("BMW","Green");
        File file3 = new File("BMW","Green");
        File file9 = new File("BMW","Green");
        File file10 = new File("BMW","Green");

        return new File[]{file1, file2, file3, file4, file5, file6, file7, file8, file9, file10};
    }
}
