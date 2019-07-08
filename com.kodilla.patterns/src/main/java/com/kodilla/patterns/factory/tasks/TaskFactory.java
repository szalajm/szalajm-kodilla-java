package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskType){
        switch (taskType){
            case DRIVING:
                return new DrivingTask("Give Your Granny a lift: to do", "Ciechocinek", "your car");
            case PAINTING:
                return new PaintingTask("Paint your room: done", "black", "collage");
            case SHOPPING:
                return new ShoppingTask("Daily Delivery", "Beer", 24);
            default:
                return null;
        }
    }
}
