package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.TaxiOrder;

import java.math.BigDecimal;

public class BasicTaxiOrder implements TaxiOrder {
    @Override
    public BigDecimal getCost(){
        return new BigDecimal(5.0);
    }

    @Override
    public String getDescription(){
        return "Drive a course";
    }
}
