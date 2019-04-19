package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        OddNumbersExterminator tester = new OddNumbersExterminator();
        List<Integer> result = tester.exterminate(emptyList);
        // Assert
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        for(int n=1; n<11; n++){
           normalList.add(n);
        }
        //When
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(2);
        result.add(4);
        result.add(6);
        result.add(8);
        result.add(10);

        OddNumbersExterminator tester = new OddNumbersExterminator();
        List<Integer> test = tester.exterminate(normalList);
        //Assert
        Assert.assertEquals(test, result);
    }
}
