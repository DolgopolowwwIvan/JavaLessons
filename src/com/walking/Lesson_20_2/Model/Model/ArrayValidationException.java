package com.walking.Lesson_20_2.Model.Model;

public class ArrayValidationException extends Exception{
    private final int invalidIndex;

    public ArrayValidationException(String message, int invalidIndex){
        super(message);
        this.invalidIndex = invalidIndex;
    }

    public int getInvalidIndex() {
        return invalidIndex;
    }
}
