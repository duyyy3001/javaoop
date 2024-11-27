package javaoop.lecture.classobject.shape2;

public class Triangle extends Shape {
    private int base,height;
    public Triangle() {
        super();
        base=height=-1;
    }
    public Triangle(String color, int base, int height) {
        super(color);
        this.base=base;
        this.height=height;
    }
    public void setBase(int a) {
        base=a;
    }
    public int getBase() {
        return base;
    }
    public void setHeight(int a) {
        height=a;
    }
    public int getHeight() {
        return height;
    }
    public double getArea() {
        return 0.5*base*height;
    }
}
