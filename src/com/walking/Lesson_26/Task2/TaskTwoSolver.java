package com.walking.Lesson_26.Task2;

public class TaskTwoSolver {
    public static void splitWords(String array){
        int total = 1;
        String[] temp = array.split(" ");

        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 1; j < temp.length - 1; j++) {
                if(temp[i].compareToIgnoreCase(temp[j]) == 0){
                    total += 1;
                    break;
                }
            }
        }









    }
}
