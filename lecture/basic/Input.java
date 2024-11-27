package javaoop.lecture.basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int n=sc.nextInt();
        System.out.print("Nhap so thuc: ");
        double a=sc.nextDouble();
        System.out.print("Nhap 1 ki tu: ");
        char c=sc.next().charAt(0);
        System.out.print("Nhap 1 chuoi ki tu: ");
        sc.nextLine();
        String s=sc.nextLine();
        System.out.print(n+"\n"+a+"\n"+c+"\n"+s+"\n");
        sc.close();
    }
}