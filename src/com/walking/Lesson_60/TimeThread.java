package com.walking.Lesson_60;

import java.time.LocalDateTime;

// Отдельный поток выводит текущее время каждые 2 секунды
public class TimeThread extends Thread{

    public TimeThread(String name) {
        super(name);
    }

    public void run(){
        try {
            while (true){
                System.out.println(LocalDateTime.now());
                sleep(2000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
