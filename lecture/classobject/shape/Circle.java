package javaoop.lecture.classobject.shape;

import java.lang.Math;

public class Circle extends Shape implements GeometricObject {
    protected double radius;
    public Circle () {
        super();
        radius=0;
    }
    public Circle (String name, int x, int y, double radius) {
        super(name, x, y);
        this.radius=radius;
    }
    public double caculateArea() {
        return radius*radius*Math.PI;
    }
    public double getArea() {
        return caculateArea();
    }
    public double getPerimeter() {
        return radius*2*Math.PI;
    }
}
