package com.walking.Lesson_20_2.Model.Model;

public class Cow extends Animal {
    public static final String COW_CLASS_NAME = "Cow";

    public Cow() {
        super(COW_CLASS_NAME, "moo");
    }

    public void moo() {
        sound();
    }
}
