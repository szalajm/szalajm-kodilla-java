package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Give Your Granny a lift: to do", driving.getTaskName());
        Assert.assertEquals(false, driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Paint your room: done", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Daily Delivery", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }
}
