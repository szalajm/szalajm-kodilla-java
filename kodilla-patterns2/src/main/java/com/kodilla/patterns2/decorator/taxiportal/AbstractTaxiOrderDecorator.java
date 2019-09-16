package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.TaxiOrder;

import java.math.BigDecimal;

public abstract class AbstractTaxiOrderDecorator implements TaxiOrder {
    private final TaxiOrder taxiOrder;

    protected AbstractTaxiOrderDecorator (TaxiOrder taxiOrder){
        this.taxiOrder = taxiOrder;
    }

    @Override
    public BigDecimal getCost(){
        return taxiOrder.getCost();
    }

    @Override
    public String getDescription(){
        return taxiOrder.getDescription();
    }
}
