package com.walking.Lesson_50;

import java.util.Arrays;

public class LetterCount {

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays
                .stream(names)
                .filter(str -> str.length() > 5)
                .mapToInt(str -> str.length())
                .sum();
    }

}
