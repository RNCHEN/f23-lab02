package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    //not general
    private Shape shape;
//    constrcutor  function
    Renderer(Rectangle rectangle) {
        this.shape = rectangle;
    }

    void draw() {
        double area = shape.getArea();

        // assume implementation
        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
