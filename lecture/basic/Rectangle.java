package javaoop.lecture.basic;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap 2 canh cua hinh chu nhat: ");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("Chu vi: "+(2l*(a+b)));
        System.out.println("Dien tich: "+(1l*a*b));
        sc.close();
    }
}
