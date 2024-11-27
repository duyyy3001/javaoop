package javaoop.lab.library;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Nhap so the muon: ");
            int n=sc.nextInt();
            TheMuon[] a=new TheMuon[n];
            for (int i=0;i<n;i++) {
                a[i]=new TheMuon();
                a[i].nhap();
            }
            for (int i=0;i<n;i++) System.out.println(a[i].toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
