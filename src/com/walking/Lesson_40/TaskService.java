package com.walking.Lesson_40;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskService {

    private final Deque<Task> tasks =  new ArrayDeque<>();


    //offer - добавление в конец
    //poll - получить с конца
    public TaskService(Task... tasks){
        for (Task t: tasks){
            this.tasks.offer(t);
        }

    }

    public void addTask(Task task){
        tasks.offer(task);
        System.out.println("Задание " + task.getTaskName() + " добалено!");
    }

    public void completeTheTask(){
        Task task = tasks.poll();
        if(task == null){
            System.out.println("Очередь задач пуста");
        }
        task.taskDone();
        System.out.println("Задание " + task.getTaskName() + " выполнено!");
    }


}
