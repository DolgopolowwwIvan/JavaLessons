package com.walking.Lesson_8;

public class Counter {

    public final String name;
    public int counter;

    public Counter(String name){
        this.name = name;
        counter = 0;
    }

    public void increment(){
        counter++;
    }

    public void decrement(){
        counter--;
    }

    public void increase(int n){
        counter += n;
    }

    public void decrease(int n){
        counter -=1;
    }
}
