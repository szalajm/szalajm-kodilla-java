package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.function.BiFunction;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testOrderBasicPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testOrderBasicPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Make a basic pizza (sauce and cheese)", description);
    }

    @Test
    public void testOrderCapriciosaWithExtraSalamiGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CapriciosaOrderDecorator(theOrder);
        theOrder = new ExtraSalamiOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(27), theCost);
    }

    @Test
    public void testOrderCapriciosaWithExtraSalamiGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CapriciosaOrderDecorator(theOrder);
        theOrder = new ExtraSalamiOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Make a pizza (sauce and cheese): capriciosa(plus: ham, mushroom) + extra salami", description);
    }

    @Test
    public void testPepperoniOrderDecoratorWithDoubleSalamiAndExtraSauceGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniOrderDecorator(theOrder);
        theOrder = new ExtraSalamiOrderDecorator(theOrder);
        theOrder = new ExtraSalamiOrderDecorator(theOrder);
        theOrder = new ExtraSauceOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), theCost);
    }


    @Test
    public void testPepperoniOrderDecoratorWithDoubleSalamiAndExtraSauceGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniOrderDecorator(theOrder);
        theOrder = new ExtraSalamiOrderDecorator(theOrder);
        theOrder = new ExtraSalamiOrderDecorator(theOrder);
        theOrder = new ExtraSauceOrderDecorator(theOrder);
        //When
        String description  = theOrder.getDescription();
        //Then
        assertEquals("Make a pizza (sauce and cheese): pepperoni(plus: pepperoni) + extra salami + extra salami + extra sauce", description);
    }
}
