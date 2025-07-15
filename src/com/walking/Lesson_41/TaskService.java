package com.walking.Lesson_41;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskService {

    private final Set<Task> tasks =  new LinkedHashSet<>();


    //offer - добавление в конец
    //poll - получить с конца
    public TaskService(Task... tasks){
        for (Task t: tasks){
            this.tasks.add(t);
        }

    }

    public void addTask(Task task){
        tasks.add(task);
        System.out.println("Задание " + task.getTaskName() + " добалено!");
    }

    public void completeTheTask(){
        if (!tasks.isEmpty()){
            Iterator<Task> iterator = tasks.iterator();
            Task firstElement = iterator.next();
            iterator.remove();
            System.out.println("Задание " + firstElement.getTaskName() + " выполнено!");
        }else {
            System.out.println("Очередь задач пуста");
        }
    }


}
