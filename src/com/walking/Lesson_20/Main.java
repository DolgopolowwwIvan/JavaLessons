package com.walking.Lesson_20;


import com.walking.Lesson_20.model.File;
import com.walking.Lesson_20.model.FileType;
import com.walking.Lesson_20.service.FileService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService(initFiles());

        File desiredFile = createFile();
        File foundFile = fileService.getFileByName(String.valueOf(desiredFile.getName()));

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
                System.out.println("Ошибка! Неверный тип файла.");
            }
        }

        scanner.close();

        return new File(name, file_size, type);
    }

    private static File[] initFiles() {
        File file6 = new File("1",221222, FileType.AUDIO);
        File file4 = new File("2",334343333, FileType.AUDIO);
        File file5 = new File("3", 33323433,FileType.AUDIO);
        File file2 = new File("4", 22323222, FileType.AUDIO);
        File file7 = new File("Toyota", 333333, FileType.AUDIO);
        File file8 = new File("dfdf",333323333, FileType.AUDIO);
        File file1 = new File("fdf",333233333, FileType.AUDIO);
        File file3 = new File("fdffdsf",332323333, FileType.AUDIO);
        File file9 = new File("hggh",33333233, FileType.AUDIO);
        File file10 = new File("gfg",333332333, FileType.AUDIO);

        return new File[]{file1, file2, file3, file4, file5, file6, file7, file8, file9, file10};
    }
}
