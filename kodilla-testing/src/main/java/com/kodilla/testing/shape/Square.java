package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideMilimeters;

    public Square(double sideMilimeters){
        this.sideMilimeters = sideMilimeters;
    }

    public Object getShapeName(){
        System.out.println("This is a square");
        return null;
    }

    public void getField() {
        System.out.println("The field equals:" + sideMilimeters*sideMilimeters);
    }
}

