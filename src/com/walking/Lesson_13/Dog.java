package com.walking.Lesson_13;

public class Dog extends Animal{
    public static final String DOG_CLASS_NAME = "Dog";

    public Dog(){
        super(DOG_CLASS_NAME);
    }

    @Override
    public void sound(){
        System.out.println("woof");
    }
}
