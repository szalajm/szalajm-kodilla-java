package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.TaxiOrder;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import static org.junit.Assert.*;


public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(5), calculatedCost);

    }

    @Test
    public void testBasicTaxiOrderGetDescription(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course", description);
    }

}
