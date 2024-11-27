package javaoop.lab.vehicle;

import java.util.Scanner;

public class PTGT {
    protected String hang,mau;
    protected int giaBan,namSx;
    public PTGT() {
        hang=mau="";
        giaBan=namSx=0;
    }
    public PTGT(String hang, String mau, int giaBan, int namSx) {
        this.hang=hang;
        this.mau=mau;
        this.giaBan=giaBan;
        this.namSx=namSx;
    }
    public void setHang(String a) {
        hang=a;
    }
    public String getHang() {
        return hang;
    }
    public void setMau(String a) {
        mau=a;
    }
    public String getMau() {
        return mau;
    }
    public void setGia(int a) {
        giaBan=a;
    }
    public int getGia() {
        return giaBan;
    }
    public void setNam(int a) {
        namSx=a;
    }
    public int getNam() {
        return namSx;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap hang: ");
        hang=sc.nextLine();
        System.out.print("Nhap nam san xuat: ");
        namSx=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap mau: ");
        mau=sc.nextLine();
        System.out.print("Nhap gia ban: ");
        giaBan=sc.nextInt();
    }
    public String toString() {
        return "Hang: "+hang+"\nNam san xuat: "+namSx+"\nMau sac: "+mau+"\nGia ban: "+giaBan;
    }
}
