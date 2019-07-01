package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAddMethod() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double result = calculator.add(2, 2);

        //Then
        Assert.assertEquals(4, result, 0.01);

    }

    @Test
    public void testSubMethod() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double result = calculator.sub(2, 2);

        //Then
        Assert.assertEquals(0, 0, 0.01);
    }

    @Test
    public void testMulMethod() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double result = calculator.mul(2, 2);

        //Then
        Assert.assertEquals(4, result, 0.01);

    }

    @Test
    public void testDivMethod() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double result = calculator.div(10, 5);

        //Then
        Assert.assertEquals(2, result, 0.01);
    }

}
