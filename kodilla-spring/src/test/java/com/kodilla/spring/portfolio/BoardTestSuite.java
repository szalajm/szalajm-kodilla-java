package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testAddTask() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        BoardConfig testBoard = context.getBean(BoardConfig.class);

        //When
        TaskList doTo = testBoard.toDoList();
        doTo.addTask("Do zrobienia");

        TaskList inProgress = testBoard.inProgressList();
        inProgress.addTask("W trakcie roboty");

        TaskList done = testBoard.doneList();
        done.addTask("Zrobione");

        //Then
        System.out.println(doTo);
        System.out.println(inProgress);
        System.out.println(done);

    }
}
