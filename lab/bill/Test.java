package javaoop.lab.bill;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Nhap so luong bien lai: ");
            int n=sc.nextInt();
            BienLai[] a=new BienLai[n];
            for (int i=0;i<n;i++) {
                a[i]=new BienLai();
                a[i].nhap();
            }
            for (int i=0;i<n;i++) System.out.println(a[i].toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
