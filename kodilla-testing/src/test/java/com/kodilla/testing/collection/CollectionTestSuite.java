package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import org.junit.Assert;

import java.util.ArrayList;

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
        tester.exterminate(emptyList);
        // Assert
        Assert.assertEquals(null, emptyList);
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
        for(int n=1; n<11; n++) {
            if(n % 2 == 0){
                result.add(n);
            }
        }
        OddNumbersExterminator tester = new OddNumbersExterminator();
        tester.exterminate(normalList);
        //Assert
        Assert.assertEquals(normalList, result);
    }
}
