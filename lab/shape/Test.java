package javaoop.lab.shape;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so tam giac: ");
        int n=sc.nextInt();
        TamGiac[] a=new TamGiac[n];
        for (int i=0;i<n;i++) {
            a[i]=new TamGiac();
            a[i].nhap();
        }
        for (int i=0;i<n;i++) {
            if (a[i].check()) {
                System.out.println("Chu vi cua tam giac "+(i+1)+" la: "+a[i].perimeter());
                System.out.println("Dien tich cua tam giac "+(i+1)+" la: "+a[i].getArea());
            }
            else System.out.println("Tam giac khong hop le!");
        }
        sc.close();
    }
}
