package javaoop.lab.shape;

import java.lang.Math;
import java.util.Scanner;

public class TamGiac extends DaGiac {
    public TamGiac () {
        super();
        edges=3;
    }
    public void nhap() {
        eLength=new double[edges];
        System.out.print("Nhap 3 canh cua tam giac: ");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<eLength.length;i++) eLength[i]=sc.nextDouble();
    }
    public double perimeter() {
        double a=0;
        for(int i=0;i<edges;i++) a+=eLength[i];
        return a;
    }
    public boolean check() {
        return eLength[0]>0&&eLength[1]>0&&eLength[2]>0&&eLength[0]+eLength[1]>eLength[2]&&eLength[0]+eLength[2]>eLength[1]&&eLength[1]+eLength[2]>eLength[0];
    }
    public double getArea() {
        double p=(eLength[0]+eLength[1]+eLength[2])/2;
        return Math.sqrt(p*(p-eLength[0])*(p-eLength[1])*(p-eLength[2]));
    }
}
