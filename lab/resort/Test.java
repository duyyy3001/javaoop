package javaoop.lab.resort;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Nhap so phong: ");
            int n=sc.nextInt();
            KhachSan[] a=new KhachSan[n];
            for (int i=0;i<n;i++) {
                a[i]=new KhachSan();
                a[i].nhap();
            }
            for (int i=0;i<n;i++) System.out.println(a[i].toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
