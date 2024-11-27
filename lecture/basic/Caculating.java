package javaoop.lecture.basic;

import java.util.Scanner;

public class Caculating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap 2 so nguyen: ");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println((a+b)+" "+(a-b)+" "+(a*b)+" "+(1.0*a/b));
        sc.close();
    }
}
