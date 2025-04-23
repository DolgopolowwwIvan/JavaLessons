package com.walking.Lesson_20.service;

import com.walking.Lesson_20.model.File;

public class FileService {
    private File[] files;

    public FileService(File... files){
        this.files = files;
    }

    public File addFile(File file){
        int ArrayLength = files.length + 1; // Увеличиваем длину массива на 1
        // чтобы все влезло
        File[] newArrayForFile = new File[ArrayLength];

        newArrayForFile[files.length - 1] = file;

        files = copyArray(files, newArrayForFile);

        return files[files.length - 1];
    }

    private File[] copyArray(File[] oldArray, File[] newArray){
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        return newArray;
    }

    public File[] getAllFiles(){
        return files;
    }

    public File getFileByName(String name){
        for (int i = 0; i < files.length; i++) {
            if(files[i].getName() == name){
                return files[i];
            }
        }
        throw new FileNotFoundException("Файл не найден");
    }
}
