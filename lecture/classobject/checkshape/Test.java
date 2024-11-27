package javaoop.lecture.classobject.checkshape;

import javaoop.lecture.classobject.shape2.*;

public class Test {
    public static void main(String[] args) {
        Triangle a=new Triangle();
        Rectangle b=new Rectangle();
        if (b instanceof Rectangle) {
            System.out.println(b.toString());
        }
        if (a instanceof Triangle) System.out.print(a.toString());
    }
}
