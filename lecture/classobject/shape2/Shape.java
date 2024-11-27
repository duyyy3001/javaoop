package javaoop.lecture.classobject.shape2;

public abstract class Shape {
    protected String color;
    public Shape() {
        color="";
    }
    public Shape(String color) {
        this.color=color;
    }
    public void setColor(String a) {
        color=a;
    }
    public String getColor() {
        return color;
    }
    public abstract double getArea();
    public String toString() {
        return "Mau: "+color+"\nDien tich: "+getArea();
    }
}