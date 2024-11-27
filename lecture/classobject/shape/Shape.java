package javaoop.lecture.classobject.shape;

public abstract class Shape {
    protected String name;
    protected int x, y;
    public Shape() {
        name="";
        x=y=0;
    }
    public Shape(String name, int x, int y) {
        this.name=name;
        this.x=x;
        this.y=y;
    }
    public void setName(String a) {
        name=a;
    }
    public String getName() {
        return name;
    }
    public void setVerticalCoordinate(int a) {
        x=a;
    }
    public int getVerticalCoordinate() {
        return x;
    }
    public void setHorizontalCoordinate(int a) {
        y=a;
    }
    public int getHorizontalCoordinate() {
        return y;
    }
    public abstract double caculateArea();
}
