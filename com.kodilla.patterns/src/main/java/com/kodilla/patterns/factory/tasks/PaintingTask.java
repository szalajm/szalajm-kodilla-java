package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public void executeTask() {
        System.out.println("Paint: " + whatToPaint);
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return taskName.contains("done");
    }
}
