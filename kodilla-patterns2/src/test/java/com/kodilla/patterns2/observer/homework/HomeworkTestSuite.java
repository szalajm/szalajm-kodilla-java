package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {

    @Test
    public void testUpdate(){
        //Given
        TaskQueue kowalskiQueue = new TaskQueue("Kowalsky");
        TaskQueue cieslakQueue = new TaskQueue("Cieslak");
        TaskQueue killerQueue = new TaskQueue("Killer");
        TaskManager mentor101 = new TaskManager(101);
        TaskManager mentor102 = new TaskManager(102);
        kowalskiQueue.registerMentor(mentor101);
        cieslakQueue.registerMentor(mentor101);
        killerQueue.registerMentor(mentor102);
        //When
        kowalskiQueue.addTask("25.2");
        kowalskiQueue.addTask("25.3");
        kowalskiQueue.addTask("25.4");
        cieslakQueue.addTask("30.0");
        cieslakQueue.addTask("70.1");
        killerQueue.addTask("01.01");
        //Then
        Assert.assertEquals(5, mentor101.getUpdateCount());
        Assert.assertEquals(1, mentor102.getUpdateCount());
    }
}
