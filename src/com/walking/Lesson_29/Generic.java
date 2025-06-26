package com.walking.Lesson_29;

public class Generic <T>{
    private final T value;

    public Generic(T sth){
        this.value = sth;
    }

    public T getValue(){
        return value;
    }
}
