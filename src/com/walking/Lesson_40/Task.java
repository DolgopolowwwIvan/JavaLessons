package com.walking.Lesson_40;

import java.time.LocalDateTime;


public class Task {

    private final String taskName;
    private final LocalDateTime issueTime;
    private boolean isDone;

    public Task(String taskName){
        this.taskName = taskName;
        this.issueTime = LocalDateTime.now();
        this.isDone = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public LocalDateTime getIssueTime() {
        return issueTime;
    }

    public boolean isDone() {
        return isDone;
    }

    public void taskDone() {
        this.isDone = true;
    }
}
