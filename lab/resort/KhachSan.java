package javaoop.lab.resort;

import java.util.Scanner;

public class KhachSan {
    protected int soNgay,gia,soNguoi;
    protected String loai;
    protected Nguoi[] nguoi;
    public KhachSan() {
        soNgay=gia=soNguoi=2;
        loai="";
        nguoi=new Nguoi[soNguoi];
    }
    public KhachSan(int soNgay, int gia, int soNguoi, Nguoi[] nguoi, String loai) {
        this.soNgay=soNgay;
        this.gia=gia;
        this.soNguoi=soNguoi;
        this.loai=loai;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so ngay thue: ");
        soNgay=sc.nextInt();
        System.out.print("Nhap gia phong: ");
        gia=sc.nextInt();
        System.out.print("Nhap so nguoi: ");
        soNguoi=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap loai phong: ");
        loai=sc.nextLine();
        for (int i=0;i<nguoi.length;i++) {
            nguoi[i]=new Nguoi();
            nguoi[i].nhap();
        }
    }
    public int getMoney() {
        return soNgay*gia;
    }
    public String toString() {
        String s="So ngay: "+soNgay+"\nGia: "+getMoney()+"\nSo nguoi: "+soNguoi+"\nLoai: "+loai;
        for (int i=0;i<soNguoi;i++) s+=nguoi[i].toString();
        return s;
    }
}
