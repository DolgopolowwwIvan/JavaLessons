package com.walking.Lesson_28.Task1;

public class GenericForNumber<Type> {
    private Type field;

    public static <Type extends Number> double pow(Type number, double exponent){
        double value = number.doubleValue();
        return Math.pow(value, exponent);
    }

    public void setField(Type field){
        this.field = field;
    }
}
