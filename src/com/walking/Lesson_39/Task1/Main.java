package com.walking.Lesson_39.Task1;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.push(3);
        list.push(2);
        list.push(4);
        list.push(5);
        list.insert(999,4);

        list.display();
    }
}
