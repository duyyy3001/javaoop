package javaoop.lecture.classobject.patient;

import java.util.Scanner;

public class BenhVien {
    private String ten, diaChi, giamDoc;
    public BenhVien () {
        ten=diaChi=giamDoc="";
    }    
    public BenhVien (String ten, String diaChi, String giamDoc) {
        this.ten=ten;
        this.diaChi=diaChi;
        this.giamDoc=giamDoc;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten:");
        ten=sc.nextLine();
        System.out.print("Nhap dia chi:");
        diaChi=sc.nextLine();
        System.out.print("Nhap giam doc:");
        giamDoc=sc.nextLine();
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
    public void setGiamDoc(String a) {
        giamDoc=a;
    }
    public String getGiamDoc() {
        return giamDoc;
    }
    public String toString() {
        return ten+" "+diaChi+" "+giamDoc+" ";
    }
}