package javaoop.lecture.basic;

import java.util.Scanner;

public class Caculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap 2 so nguyen: ");
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.print("Nhap 1 ki tu:");
        char c=sc.next().charAt(0);
        if (c=='A') System.out.print("Tong 2 so: "+(a+b));
        else if (c=='S') System.out.print("Hieu 2 so: "+(a-b));
        else if (c=='M') System.out.print("Tich 2 so: "+(1l*a*b));
        else if (c=='D') System.out.print("Thuong 2 so: "+(1.0*a/b));
        else System.out.println("Ki tu nhap khong hop le");
        sc.close();
    }
}
