package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite  {

    @Test
    public void testEmptyList() {
        //Given
        int[] set = new int[0];

        //When
        double theAverage = ArrayOperations.getAverage(set);

        //Then
        Assert.assertEquals(0, theAverage, 0.01);

    }

    @Test
    public void testGetAverage () {
        //Given
        int[] set = new int[10];
        set[0] = 10;
        set[1] = 10;
        set[2] = 10;
        set[3] = 10;
        set[4] = 10;
        set[5] = 20;
        set[6] = 20;
        set[7] = 20;
        set[8] = 20;
        set[9] = 20;

        //When
        double theAverage = ArrayOperations.getAverage(set);

        //Then
        Assert.assertEquals(15, theAverage, 0.1);
    }
}
