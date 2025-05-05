package com.walking.Lesson_28.Task3;

import java.util.Objects;

public class GenericArray<Type>{

    //Реализовать класс для работы с массивом.
    //Разработать метод, производящий поиск значения в массиве.
    //Если значение не найдено — выбрасывать исключение. Если найдено — возвращать его.

    private final Type[] genericField;

    public GenericArray(Type[] genericField){
        this.genericField = genericField;
    }

    public Type[] getGenericField() {
        return genericField;
    }

    public Type valueFinder(Type item){
        for (int i = 0; i < genericField.length; i++) {
            if(Objects.equals(genericField[i], item)){
                return genericField[i];
            }
        }
        throw new IllegalArgumentException("Value " + item + " not found!" );
    }


}
