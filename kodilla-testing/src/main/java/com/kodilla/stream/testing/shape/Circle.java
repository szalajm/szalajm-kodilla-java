package com.kodilla.stream.testing.shape;

public class Circle implements Shape {

    private double radiusMilimeters;

    public Circle(double radiusMilimeters) {
        this.radiusMilimeters = radiusMilimeters;
    }

    public Object getShapeName() {
        System.out.println("This is circle");

        return null;
    }

    public void getField() {
        System.out.println("The field equals:" + 3.14 * radiusMilimeters * radiusMilimeters);
    }
}

