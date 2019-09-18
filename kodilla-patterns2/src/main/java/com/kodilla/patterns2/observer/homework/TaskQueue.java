package com.kodilla.patterns2.observer.homework;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Homework {
    private final List<Mentor> mentors;
    private final List<String> messages;
    private final String student;

    public TaskQueue(String student) {
        this.mentors = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.student = student;
    }

    @Override
    public void registerMentor (Mentor mentor){
        mentors.add(mentor);
    }

    @Override
    public void notifyMentors(){
        for(Mentor mentor : mentors){
            mentor.update(this);
        }
    }

    @Override
    public void removeMentor(Mentor mentor){
        mentors.remove(mentor);
    }

    public void addTask(String task){
        messages.add(task);
        notifyMentors();
    }

    public String getName(){
        return student;
    }

    public List<String> getMessages() {
        return messages;
    }

}
