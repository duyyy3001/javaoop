package javaoop.lab.street;

import java.util.Scanner;

public class KhuPho {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so ho gia dinh: ");
        int n=sc.nextInt();
        HoGiaDinh[] a=new HoGiaDinh[n];
        for (int i=0;i<n;i++) {
            a[i]=new HoGiaDinh();
            a[i].nhap();
        }
        for (int i=0;i<n;i++) {
            Nguoi[] b=a[i].getNguoi();
            for (int j=0;j<b.length;j++) {
                if (b[j].getTuoi(b[j].getNgaySinh())==80) {
                    System.out.println(a[i].toString());
                }
            }
        }
        sc.close();
    }
}
