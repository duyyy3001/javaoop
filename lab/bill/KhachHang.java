package javaoop.lab.bill;

import java.util.Scanner;

public class KhachHang {
    private String hoTen;
    private int soNha, maCongTo;
    public KhachHang() {
        hoTen="";
        soNha=maCongTo=0;
    }
    public KhachHang(String hoTen, int soNha, int maCongTo) {
        this.hoTen=hoTen;
        this.soNha=soNha;
        this.maCongTo=maCongTo;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma cong to: ");
        maCongTo=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.print("Nhap so nha: ");
        maCongTo=sc.nextInt();
    }
    public void setTen(String a) {
        hoTen=a;
    }
    public String getTen() {
        return hoTen;
    }
    public void setSoNha(int a) {
        soNha=a;
    }
    public int getSoNha() {
        return soNha;
    }
    public void setMa(int a) {
        maCongTo=a;
    }
    public int getMa() {
        return maCongTo;
    }
    public String toString() {
        return "Ma cong to: "+maCongTo+"\nHo ten: "+hoTen+"\nSo nha: "+soNha;
    }
}
