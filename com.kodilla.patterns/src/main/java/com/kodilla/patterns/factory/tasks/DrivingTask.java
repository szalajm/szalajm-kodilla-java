package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public void executeTask(){
        System.out.println("go to: " + where + "by " + using);
    }

    public String getTaskName(){
        return taskName;
    }

    public boolean isTaskExecuted(){
        return taskName.contains("achieved");
    }
}
