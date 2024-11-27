package javaoop.lecture.classobject.shape2;

public class Rectangle extends Shape {
    private int length, width;
    public double getArea() {
        return length*width;
    }
    public Rectangle() {
        super();
        length=width=0;
    }
    public Rectangle(String color,int length, int width) {
        super(color);
        this.length=length;
        this.width=width;
    }
    public void setLength(int a) {
        length=a;
    }
    public int getLength() {
        return length;
    }
    public void setWidth(int a) {
        width=a;
    }
    public int getWidth() {
        return width;
    }
}
