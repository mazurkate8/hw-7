package com.app.redactor;
public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = new Circle();
        Shape diamond = new Diamond();
        Shape oval = new Oval();
        Shape quad = new Quad();
        Shape triangle = new Triangle();

        factory.printShapeName(circle);
        factory.printShapeName(diamond);
        factory.printShapeName(oval);
        factory.printShapeName(quad);
        factory.printShapeName(triangle);
    }
}
