package com.kodilla.patterns2.decorator.pizza;

import javafx.scene.layout.BackgroundImage;

import java.math.BigDecimal;

public interface PizzaOrder {

    BigDecimal getCost();
    String getDescription();
}
