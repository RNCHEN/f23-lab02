package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height;
    private double width;

    private double startX;
    private double startY;
    private double startFrom;
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double getArea() {
        return height * width;
    }

}
