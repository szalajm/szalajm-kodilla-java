package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.ExpressDecorator;

import java.math.BigDecimal;

public class ExtraCheeseOrderDecorator extends AbstractPizzaOrderDecorator {
    public ExtraCheeseOrderDecorator (PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " add: extra cheese";
    }
}
