package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void openLogger(){
        Logger.getInstance().log("test log");
    }

    @Test
    public void testGetLastLog(){

        //Given
        //When
        String log = Logger.getInstance().getLastLog();
        System.out.println(log);
        //Then
        Assert.assertEquals("test log", log);

    }
}
