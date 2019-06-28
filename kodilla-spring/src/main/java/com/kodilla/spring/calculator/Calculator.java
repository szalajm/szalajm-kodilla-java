package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public Calculator (final Display display) {
        this.display = display;
    }

    public Double add(double a, double b) {
        Double val = a + b;

        display.displayValue(val);
        return val;
    }

    public Double sub(double a, double b) {
        Double val = a-b;

        display.displayValue(val);
        return val;
    }

    public Double mul(double a, double b) {
        Double val = a*b;

        display.displayValue(val);
        return val;
    }

    public Double div(double a, double b) {
        Double val = a / b;

        display.displayValue(val);
        return val;
    }
}
