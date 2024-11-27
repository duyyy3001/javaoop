package javaoop.lecture.basic;

import java.util.Scanner;
import java.lang.Math;

public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        double a=sc.nextDouble();
        System.out.println("Chu vi hinh tron: "+2*a*Math.PI);
        System.out.println("Dien tich hinh tron: "+a*a*Math.PI);
        sc.close();
    }
}
