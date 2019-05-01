package com.kodilla.stream.testing.shape;

import java.util.ArrayList;


public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ArrayList<Shape> getList() {
        return shapes;
    }

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            result = true;
        }
        return result;
    }


    public Shape getFigure(int figureNumber) {
        Shape theFigure = null;
        if(figureNumber >= 0 && figureNumber < shapes.size()){
            theFigure = shapes.get(figureNumber);
        }
        return theFigure;
    }

    public void showFigure (int figureNumber){
        Shape theFigure = null;
        if(figureNumber >= 0 && figureNumber < shapes.size()){
            theFigure = shapes.get(figureNumber);
        }

        theFigure.getShapeName();
    }

    public int getFiguresQuantity(){
        return shapes.size();
    }
}
