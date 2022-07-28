package baitap.bai1;

import baitap.bai1d7.Circle;

public class Cylinder extends Circle {
    // add height attribute
    private double height = 1.0;

    // contructor
    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // getter, setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public String toString() {
        return "Mot hinh tru voi height = " + getHeight()
                + " No la mot class con cua " + super.toString();
    }

}
