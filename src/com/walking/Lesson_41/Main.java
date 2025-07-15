package com.walking.Lesson_41;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Ботать");
        Task task2 = new Task("Пиво пить");
        Task task3 = new Task("Качаться");
        Task task4 = new Task("Ботать2");

        TaskService taskService = new TaskService(task1, task2, task3);

        taskService.addTask(task4);

        taskService.completeTheTask();
    }
}
