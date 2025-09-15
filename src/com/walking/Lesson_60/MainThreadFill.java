package com.walking.Lesson_60;

import java.util.Random;

public class MainThreadFill implements Fillable{

    private static final Random random = new Random(2222);

    @Override
    public void fillTheArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                array[i][j] = random.nextInt(10) + 1;
            }
        }
    }
}
