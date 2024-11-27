package javaoop.lab.vehicle;

import java.util.Scanner;
import javaoop.mylib.*;

public class QLPTGT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Nhap so phuong tien: ");
            int n=sc.nextInt();
            PTGT[] a=new PTGT[n];
            for (int i=0;i<n;i++) {
                System.out.println("Chon loai phuong tien: ");
                System.out.println("1. Xe may\n2. O to\n3. Xe tai");
                int x;
                do {
                    System.out.print("Nhap 1 so: ");
                    x=sc.nextInt();
                    if (x<1||x>3) System.out.println("Du lieu khong hop le. Vui long nhap lai!");
                } while (x<1||x>3);
                if (x==1) {
                    a[i]=new XeMay();
                    a[i].nhap();
                }
                else if (x==2) {
                    a[i]=new Oto();
                    a[i].nhap();
                }
                else {
                    a[i]=new XeTai();
                    a[i].nhap();
                }
            }
            for (int i=0;i<n;i++) System.out.println(a[i].toString()+"\n");
            System.out.print("Nhap nam san xuat:");
            int x=sc.nextInt();
            System.out.println("Cac xe san xuat nam "+x+':');
            for (int i=0;i<n;i++) {
                if (x==a[i].getNam()) System.out.println(a[i].toString()+"\n");
            }
            System.out.print("Nhap mau sac: ");
            String s=sc.nextLine();
            System.out.println("Cac xe co mau "+s+':');
            for (int i=0;i<n;i++) {
                if (StringCompare.compare(s,a[i].getMau())) System.out.println(a[i].toString()+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}