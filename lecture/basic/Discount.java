package javaoop.lecture.basic;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap gia niem yet: ");
        double a=sc.nextDouble(),b;
        System.out.print("Nhap muc chiet khau (%) : ");
        b=sc.nextDouble();
        System.out.println("Gia ban: "+(a*(1-b/100)));
        sc.close();
    }
}
