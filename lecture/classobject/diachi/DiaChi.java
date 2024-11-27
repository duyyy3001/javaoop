package javaoop.lecture.classobject.diachi;

import java.util.Scanner;

public class DiaChi {
    private String thon, xa, huyen, tinh;
    public DiaChi () {
        thon=xa=huyen=tinh="";
    }
    public DiaChi(String thon, String xa, String huyen, String tinh) {
        this.thon=thon;
        this.xa=xa;
        this.huyen=huyen;
        this.tinh=tinh;
    }
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thon :");
        thon=sc.nextLine();
        System.out.print("Nhap xa :");
        xa=sc.nextLine();
        System.out.print("Nhap huyen :");
        huyen=sc.nextLine();
        System.out.print("Nhap tinh :");
        tinh=sc.nextLine();
    }
    public void setThon(String thon) {
        this.thon=thon;
    }
    public String getThon() {
        return thon;
    }
    public void setXa(String xa) {
        this.xa=xa;
    }
    public String getXa() {
        return xa;
    }
    public void setHuyen(String huyen) {
        this.huyen=huyen;
    }
    public String getHuyen() {
        return huyen;
    }
    public void setTinh(String tinh) {
        this.tinh=tinh;
    }
    public String getTinh() {
        return tinh;
    }
    public String toString() {
        return thon+" "+xa+" "+huyen+" "+tinh;
    }
}