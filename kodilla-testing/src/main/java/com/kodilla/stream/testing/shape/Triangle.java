package com.kodilla.stream.testing.shape;

public class Triangle implements Shape{

    private double aSideMilimeters;
    private double heightMilimeters;

    public Triangle(double aSideMilimeters, double heightMilimeters){
        this.aSideMilimeters = aSideMilimeters;
        this.heightMilimeters = heightMilimeters;
    }

    public Object getShapeName(){
        System.out.println("This is a triangle");
        return null;
    }

    public void getField() {
        System.out.println("The field equals:" + (aSideMilimeters*heightMilimeters)/2);
    }
}
