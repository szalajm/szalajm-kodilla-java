package com.kodilla.patterns2.observer.homework;

public class TaskManager implements Mentor {
    private final int mentorId;
    private int updateCount;

    public TaskManager(int mentorId){
        this.mentorId = mentorId;
    }

    @Override
    public void update(TaskQueue taskQueue){
        System.out.println("Mentor: " + mentorId + " New task sent for review by: " + taskQueue.getName() + "\n" +
        "total number of tasks in the queue: " + taskQueue.getMessages().size());
        updateCount++;
    }

    public int getMentorId() {
        return mentorId;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
