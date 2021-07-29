package com.app.redactor;
public class ShapeFactory implements DrawShape {

    @Override
    public void printShapeName(Shape shape) {
        System.out.println("The shape name is: " + shape.getName());
    }
}