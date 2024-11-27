package javaoop.lecture.classobject.shape;

public class ResizeableCircle extends Circle implements Resizeable {
    public void resize(int percent) {
        double a=caculateArea();
        a*=percent;
    }
    public ResizeableCircle (double radius) {
        super();
        this.radius=radius;
    }
}
