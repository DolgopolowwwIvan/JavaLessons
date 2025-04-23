package com.walking.Lesson_13;

public class Animal {
    private final String className;


    protected Animal(String name){
        this.className = name;
    }

    protected void sound(){
        System.out.println();
    }

    public String getClassName() {
        return className;
    }


}
