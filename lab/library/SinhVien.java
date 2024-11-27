package javaoop.lab.library;

import java.time.LocalDate;
import java.util.Scanner;

public class SinhVien {
    private String ten,ma,lop;
    private LocalDate ngaySinh;
    public SinhVien() {
        ten=ma=lop="";
        ngaySinh=LocalDate.now();
    }
    public SinhVien(String ma,String ten, LocalDate ngaySinh, String lop) {
        this.ma=ma;
        this.ten=ten;
        this.ngaySinh=ngaySinh;
        this.lop=lop;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        ma=sc.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        ten=sc.nextLine();
        System.out.print("Nhap ngay thang nam sinh: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        ngaySinh=LocalDate.of(c, b, a);
        sc.nextLine();
        System.out.print("Nhap lop: ");
        lop=sc.nextLine();
    }
    public String toString() {
        return "Ma SV: "+ma+"\nHo ten: "+ten+"\nNgay sinh: "+ngaySinh.toString()+"\nLop: "+lop;
    }
}
