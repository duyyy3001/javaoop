package javaoop.lecture.classobject.employee;

import java.util.Scanner;

import javaoop.mylib.StringCompare;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        do {
            System.out.print("Nhap so luong nhan vien (nhap cac so tu 2 den 6): ");
            m=sc.nextInt();
            if (m<2||m>6) System.out.println("Du lieu khong hop le, vui long nhap lai!");
        } while(m<2||m>6);
        do {
            System.out.print("Nhap so luong nhan vien ban thoi gian (nhap cac so tu 2 den 5): ");
            n=sc.nextInt();
            if (n<2||n>5) System.out.println("Du lieu khong hop le, vui long nhap lai!");
        } while(n<2||n>5);
        Employee[] b=new Employee[m];
        PartTimeEmployee[] a=new PartTimeEmployee[n];
        for (int i=0;i<m;i++) {
            b[i]=new Employee();
            b[i].nhap();
        }
        for (int i=0;i<n;i++) {
            a[i]=new PartTimeEmployee();
            a[i].nhap();
        }
        System.out.println();
        for (int i=0;i<m;i++) System.out.println(b[i].toString());
        for (int i=0;i<n;i++) System.out.println(a[i].toString());
        System.out.print("Nhap ten nhan vien: ");
        sc.nextLine();
        String str=sc.nextLine();
        boolean check=true;
        for (int i=0;i<m;i++) {
            if (StringCompare.compare(str,b[i].getTen())) {
                System.out.println(b[i].toString());
                check=false;
            }
        }
        if (check) System.out.println("Nhan vien khong ton tai!");
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if (a[i].getsalary()<a[j].getsalary()) {
                    PartTimeEmployee tg=a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
            }
        }
        for (int i=0;i<m;i++) {
            for (int j=i+1;j<n;j++) {
                if (b[i].getsalary()<b[j].getsalary()) {
                    Employee tg=b[i];
                    b[i]=b[j];
                    b[j]=tg;
                }
            }
        }
        System.out.println("Danh sach nhan vien theo luong giam dan: ");
        for (int i=0;i<n;i++) System.out.println(a[i].toString());
        for (int i=0;i<m;i++) System.out.println(b[i].toString());
        sc.close();
    }
}
