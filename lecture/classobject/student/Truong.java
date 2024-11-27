package javaoop.lecture.classobject.student;

import java.util.Scanner;

public class Truong {
    private String ten, diaChi, hieuTruong;
    public Truong () {
        ten=diaChi=hieuTruong="";
    }
    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten=ten;
        this.diaChi=diaChi;
        this.hieuTruong=hieuTruong;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten truong:");
        ten=sc.nextLine();
        System.out.print("Nhap dia chi truong:");
        diaChi=sc.nextLine();
        System.out.print("Nhap ten hieu truong:");
        hieuTruong=sc.nextLine();
    }
    public void setTen(String a) {
        ten=a;
    }
    public String getTen() {
        return ten;
    }
    public void setDiaChi(String a) {
        diaChi=a;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setHieuTruong(String a) {
        hieuTruong=a;
    }
    public String getHieuTruong() {
        return hieuTruong;
    }
    public String toString() {
        return ten+" "+diaChi+" "+hieuTruong+" ";
    }
}
